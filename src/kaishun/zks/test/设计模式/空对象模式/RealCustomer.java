package kaishun.zks.test.���ģʽ.�ն���ģʽ;

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
