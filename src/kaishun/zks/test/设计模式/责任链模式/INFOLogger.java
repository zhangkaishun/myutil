package kaishun.zks.test.���ģʽ.������ģʽ;

public class INFOLogger extends AbstractLogger{

	public INFOLogger(int level, String message) {
		super(level, message);
	}

	@Override
	public void write(String message) {
		System.out.println("info log:"+message);
	}

}
