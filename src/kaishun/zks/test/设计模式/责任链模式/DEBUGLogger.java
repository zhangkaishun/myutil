package kaishun.zks.test.���ģʽ.������ģʽ;

public class DEBUGLogger extends AbstractLogger{

	public DEBUGLogger(int level, String message) {
		super(level, message);
	}

	@Override
	public void write(String message) {
		System.out.println("debug log:"+message);
	}

}
