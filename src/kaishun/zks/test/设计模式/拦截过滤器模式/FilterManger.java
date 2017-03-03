package kaishun.zks.test.设计模式.拦截过滤器模式;

public class FilterManger {
	FilterChain chain;
	public FilterManger(Target target){
		chain=new FilterChain();
		chain.setTarget(target);
	}
	public void setFilter(Filter filter){
		chain.addFilter(filter);
	}
	public void filterRequest(String request){
		chain.execute(request);
	}
}
