package kaishun.zks.test.设计模式.责任链模式;

public class DEBUGLogger extends AbstractLogger{

	public DEBUGLogger(int level, String message) {
		super(level, message);
	}

	@Override
	public void write(String message) {
		System.out.println("debug log:"+message);
	}

}
