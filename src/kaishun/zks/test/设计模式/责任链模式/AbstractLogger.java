package kaishun.zks.test.设计模式.责任链模式;

public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	public int level;

	public AbstractLogger nextLogger;

	public AbstractLogger(int level, String message) {
		this.level = level;
	}

	public void logger(int level, String message) {
		if (this.level <= level) {
			write(message);
		} else {
			nextLogger.logger(level, message);
		}
	}

	
	public AbstractLogger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public abstract void write(String message);
}
