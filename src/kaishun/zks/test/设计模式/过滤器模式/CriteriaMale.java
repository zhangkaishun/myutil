package kaishun.zks.test.���ģʽ.������ģʽ;

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
