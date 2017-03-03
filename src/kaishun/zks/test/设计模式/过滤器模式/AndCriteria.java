package kaishun.zks.test.���ģʽ.������ģʽ;

import java.util.List;

public class AndCriteria implements Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;
	public AndCriteria(Criteria criteria,Criteria otherCriteria){
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstMeetPerson=criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstMeetPerson);
	}

}
