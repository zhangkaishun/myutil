package kaishun.zks.test.���ģʽ.���ع�����ģʽ;

public class Client {
	FilterManger filterManger;
	public void setFilterManger(FilterManger manger){
		this.filterManger=manger;
	}
	public void sendRequest(String request){
		filterManger.filterRequest(request);
	}
}
