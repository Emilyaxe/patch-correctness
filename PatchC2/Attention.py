import torch.nn as nn
import torch.nn.functional as F
import torch

import math


class Attention(nn.Module):
    """
    Compute 'Scaled Dot Product Attention
    """

    def forward(self, query, key, value, mask=None, dropout=None, relem=None):
        if relem is not None:
            scores = torch.matmul(query.unsqueeze(3), (key.unsqueeze(2) + relem).transpose(-2, -1)).squeeze(-2)
        else:
            scores = torch.matmul(query, key.transpose(-2, -1)) \
                 / math.sqrt(query.size(-1))

        if mask is not None:
            if len(list(mask.size())) != 4:
                #print(mask.size())
                mask = mask.unsqueeze(1).repeat(1, query.size(2), 1).unsqueeze(1)
            #print(mask.shape)
            scores = scores.masked_fill(mask == 0, -1e9)
        p_attn = F.softmax(scores, dim=-1)

        if dropout is not None:
            p_attn = dropout(p_attn)
        if relem is not None:
            ans = torch.matmul(p_attn.unsqueeze(3), (value.unsqueeze(2) + relem)).squeeze(-2)
        else:
            ans = torch.matmul(p_attn, value)
        return ans, p_attn