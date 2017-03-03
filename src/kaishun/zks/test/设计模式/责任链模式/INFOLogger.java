package kaishun.zks.test.设计模式.责任链模式;

public class INFOLogger extends AbstractLogger{

	public INFOLogger(int level, String message) {
		super(level, message);
	}

	@Override
	public void write(String message) {
		System.out.println("info log:"+message);
	}

}
