package kaishun.zks.test.设计模式.过滤器模式;

import java.util.List;

public class OrCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	public OrCriteria(Criteria criteria,Criteria otherCriteria){
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstMeetCriteria = criteria.meetCriteria(persons);
		List<Person> otherMeetCriteria = otherCriteria.meetCriteria(persons);
		firstMeetCriteria.addAll(otherMeetCriteria);
		return firstMeetCriteria;
	}

}
