package org.testing.utilities;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

    private static Logger log;

    // Initialize logger
    public static void initializeLogger() {
        DOMConfigurator.configure("../APIFW/layout.xml");
        log = Logger.getLogger(LogsCapture.class);
    }

    // Log message without deleting the log file
    public static void takeLog(String className, String msg) {
        if (log == null) {
            log = Logger.getLogger(className);
        }
        log.info(msg);
    }

    // Clear the log file at the start of the test run
    public static void clearLog() {
        File logFile = new File("../APIFW/Application.Log");
        if (logFile.exists()) {
            logFile.delete();
        }
    }
}
