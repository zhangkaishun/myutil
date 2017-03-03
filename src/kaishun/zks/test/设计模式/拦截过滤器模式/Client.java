package kaishun.zks.test.设计模式.拦截过滤器模式;

public class Client {
	FilterManger filterManger;
	public void setFilterManger(FilterManger manger){
		this.filterManger=manger;
	}
	public void sendRequest(String request){
		filterManger.filterRequest(request);
	}
}
