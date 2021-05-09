package script;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import entity.Subject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MulThreadTest {

    public static final int THREAD_NUM = 2 * Runtime.getRuntime().availableProcessors();

    public static final ExecutorService EXECUTOR = new ThreadPoolExecutor(THREAD_NUM, THREAD_NUM,
            10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000), r -> {
                Thread t = new Thread(r);
                t.setDaemon(true);
                t.setName("process-subject");
                return t;
            },
            (runnable, currentExecutor) -> log.warn(
                    "rejectedExecution mul thread Task {} rejected from {}", runnable.toString(),
                    currentExecutor.toString()));

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Chart", 26);
        map.put("Closure", 133);
        map.put("Math", 106);
        map.put("Lang", 65);
        map.put("Time", 27);
        List<CompletableFuture<Void>> futureList = new LinkedList<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer end = entry.getValue();
            for (int i = 1; i <= end; i++) {
                int index = i;
                futureList.add(CompletableFuture.runAsync(() -> {
                    Subject subject = new Subject(name, index);
                    // todo  写入subject之后的逻辑
                }, EXECUTOR));
            }
        }
        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0])).join();
        log.info("finish all subject!");
    }

}
