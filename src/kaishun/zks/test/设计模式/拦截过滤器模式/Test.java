package kaishun.zks.test.���ģʽ.���ع�����ģʽ;

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
