package kaishun.zks.test.���ģʽ.���ع�����ģʽ;

public class AuthenticationFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("AuthenticationFilter request:"+request);
	}

}
