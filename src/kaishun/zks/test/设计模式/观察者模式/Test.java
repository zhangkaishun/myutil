package kaishun.zks.test.���ģʽ.�۲���ģʽ;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Subject subject=new Subject();
		ObserverOne observer1=new ObserverOne(subject,"�۲���1");
		ObserverOne observer2=new ObserverOne(subject,"�۲���2");
		ObserverOne observer3=new ObserverOne(subject,"�۲���3");
		subject.setState(3);
		long a=2;
		List list=new LinkedList();
		list.iterator();
		
	}

}
