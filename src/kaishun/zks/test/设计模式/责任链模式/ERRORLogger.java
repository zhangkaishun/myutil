package kaishun.zks.test.���ģʽ.������ģʽ;

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
