package kaishun.zks.test.���ģʽ.�۲���ģʽ;

public class Test {

	public static void main(String[] args) {
		Subject subject=new Subject();
		ObserverOne observer1=new ObserverOne(subject,"�۲���1");
		ObserverOne observer2=new ObserverOne(subject,"�۲���2");
		ObserverOne observer3=new ObserverOne(subject,"�۲���3");
		subject.setState(3);
	}

}
