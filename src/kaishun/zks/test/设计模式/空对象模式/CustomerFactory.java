package kaishun.zks.test.设计模式.空对象模式;

public class CustomerFactory {
	public static final String[] names={"zhang","li","wang"};

	public static AbstractCustomer getCustomer(String name){
		for(String na : names){
			if(na.equals(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
