public class Logger {
    private static Logger instance;
    
    private StringBuilder logMessages;

    private Logger() {
        logMessages = new StringBuilder();
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append(System.lineSeparator());
    }

    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0);
    }
    
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        logger.log("Application started.");
        logger.log("Performing some operations.");
        
        System.out.println("Current Log:");
        System.out.println(logger.getLog());
        
        logger.clearLog();
        
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());
    }
}

