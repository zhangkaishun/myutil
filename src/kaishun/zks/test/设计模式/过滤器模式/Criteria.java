package kaishun.zks.test.设计模式.过滤器模式;

import java.util.List;

public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
