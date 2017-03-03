package kaishun.zks.test.设计模式.拦截过滤器模式;

public class Test {

	public static void main(String[] args) {
		
		FilterManger manger=new FilterManger(new Target());
		manger.setFilter(new AuthenticationFilter());
		manger.setFilter(new DebugFilter());
		
		Client client=new Client();
		client.setFilterManger(manger);
		client.sendRequest("hello");

	}

}
