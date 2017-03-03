package kaishun.zks.test.���ģʽ.���ع�����ģʽ;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

	private Target target;
	private List<Filter> filters = new ArrayList<Filter>();

	public void addFilter(Filter filter){
		filters.add(filter);
	}
	public void execute(String request) {
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
