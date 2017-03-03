package kaishun.zks.test.设计模式.拦截过滤器模式;

public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("DebugFilter request:"+request);
	}

}
