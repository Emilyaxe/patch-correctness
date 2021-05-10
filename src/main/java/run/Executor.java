package run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import config.Constant;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Executor {

    private static final String __name__ = "@Executor ";

    public static List<String> execute(String[] command) {
        Process process = null;
        final List<String> message = new ArrayList<>();
        try {
            ProcessBuilder builder = getProcessBuilder(command);
            builder.redirectErrorStream(true);
            process = builder.start();
            final InputStream inputStream = process.getInputStream();
            Thread processReader = new Thread(() -> {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                try {
                    while ((line = reader.readLine()) != null) {
                        message.add(line);
                    }
                } catch (IOException e) {
                    log.error("consumer process stream failed!", e);
                }
                try {
                    reader.close();
                } catch (IOException e) {
                    log.error("consumer process stream failed!", e);
                }
            });
            processReader.start();
            processReader.join();
            boolean result = process.waitFor(29, TimeUnit.MINUTES);
            if (!result) {
                log.error("execute process time out! command {}", String.join(",", command));
            }
        } catch (IOException e) {
            log.error("execute process failed! command {}", String.join(",", command), e);
        } catch (InterruptedException e) {
            log.error("execute process interrupted failed! command {}", String.join(",", command),
                    e);
        } finally {
            if (process != null) {
                process.destroy();
            }
        }
        //log.info(message.toString());
        return message;
    }

    public static List<String> asyExecute(String[] command) {
        Process process = null;
        final List<String> message = new ArrayList<>();
        try {
            ProcessBuilder builder = getProcessBuilder(command);
            builder.redirectErrorStream(true);
            process = builder.start();
            process.waitFor();
        } catch (IOException ignored) {} catch (InterruptedException e) {
            log.error("process wait failed", e);
        } finally {
            if (process != null) {
                process.destroy();
            }
        }
        //log.info(message.toString());
        return message;
    }

    private static ProcessBuilder getProcessBuilder(String[] command) {
        ProcessBuilder builder = new ProcessBuilder(command);
        Map<String, String> evn = builder.environment();
        evn.put("JAVA_HOME", Constant.COMMAND_JAVA_HOME);
        evn.put("PATH", Constant.COMMAND_JAVA_HOME + "/bin:" + evn.get("PATH"));
        return builder;
    }

}
