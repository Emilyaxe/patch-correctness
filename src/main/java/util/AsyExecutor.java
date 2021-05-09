package util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AsyExecutor {

    public static final int THREAD_NUM = 2 * Runtime.getRuntime().availableProcessors();

    public static final ExecutorService EXECUTOR = new ThreadPoolExecutor(THREAD_NUM, THREAD_NUM,
            10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000), r -> {
                Thread t = new Thread(r);
                t.setDaemon(true);
                t.setName("process-subject-%d");
                return t;
            },
            (runnable, currentExecutor) -> log.warn(
                    "rejectedExecution mul thread Task {} rejected from {}", runnable.toString(),
                    currentExecutor.toString()));
}
