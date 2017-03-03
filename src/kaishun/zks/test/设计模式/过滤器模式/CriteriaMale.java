package kaishun.zks.test.设计模式.过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> pe=new ArrayList<Person>();
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("male")){
				pe.add(person);
			}
			
		}
		return pe;
	}
}
