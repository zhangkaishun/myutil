package kaishun.zks.test.���ģʽ.�۲���ģʽ;

public class ObserverOne extends Observer{

	
	public ObserverOne(){};
	public ObserverOne(Subject subject,String name){
		super.name=name;
		super.subject=subject;
		subject.attach(this);
	}
	
	@Override
	public void sayState(int state) {
		System.out.println("�۲��ߡ�"+this.name+"�����յ��ı�"+state);
	}
}
