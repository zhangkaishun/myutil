package kaishun.zks.test.设计模式.观察者模式;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Subject subject=new Subject();
		ObserverOne observer1=new ObserverOne(subject,"观察者1");
		ObserverOne observer2=new ObserverOne(subject,"观察者2");
		ObserverOne observer3=new ObserverOne(subject,"观察者3");
		subject.setState(3);
		long a=2;
		List list=new LinkedList();
		list.iterator();
		
	}

}
