package tools;

import java.io.*;
import java.util.Date;

public class Log {
    File logFile;
    long sessionId;

    public Log() {
        this.sessionId = Thread.currentThread().getId();

        try {
            String s = "src/main/resources/logs/log_" + (new Date()).toString().replaceAll(" ", "")
                    .replaceAll(":", "") + "_" + this.sessionId + ".log";

            File file = new File(s);
            this.logFile = file;

            if (file.createNewFile()) {
                this.log("File created: " + file.getName());
            } else {
                this.log("File already exists.");
            }

        } catch (IOException e) {
            this.log("An error occurred at initLogFile()");
            e.printStackTrace();
        }

    }

    public void log(String str) {

        String info = new Date() + "\t" + sessionId + "\t" + str;

        System.out.println(info);

        try (FileWriter fw = new FileWriter(this.logFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            out.println(info);

        } catch (IOException e) {
            this.log("An error occurred at log()");
            e.printStackTrace();
        }
    }

}
