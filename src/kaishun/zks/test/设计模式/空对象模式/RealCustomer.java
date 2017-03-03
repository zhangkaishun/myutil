package kaishun.zks.test.设计模式.空对象模式;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name){
		this.name=name;
	}
	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return "my name is "+this.name;
	}

}
