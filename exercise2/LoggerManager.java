package exercise2;

import java.util.logging.Logger;

public class LoggerManager {
    private static Logger logger = Logger.getLogger(LoggerManager.class.getName());

    private LoggerManager() {
        // Private constructor to prevent instantiation
    }

    public static Logger getLogger() {
        return logger;
    }
}
