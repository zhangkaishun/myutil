package kaishun.zks.test.设计模式.观察者模式;

public class ObserverOne extends Observer{

	
	public ObserverOne(){};
	public ObserverOne(Subject subject,String name){
		super.name=name;
		super.subject=subject;
		subject.attach(this);
	}
	
	@Override
	public void sayState(int state) {
		System.out.println("观察者【"+this.name+"】接收到改变"+state);
	}
}
