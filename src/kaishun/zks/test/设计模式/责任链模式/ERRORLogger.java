package kaishun.zks.test.设计模式.责任链模式;

public class ERRORLogger extends AbstractLogger
{

	public ERRORLogger(int level, String message) {
		super(level, message);
	}

	@Override
	public void write(String message) {
		System.out.println("error log:"+message);
	}

}
