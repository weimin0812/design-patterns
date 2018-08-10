package chainofresponsibility;

/**
 * @author weimin02
 * @date 2018/8/10
 * @project design-patterns
 */
public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
