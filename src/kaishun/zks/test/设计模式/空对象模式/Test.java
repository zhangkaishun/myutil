package kaishun.zks.test.设计模式.空对象模式;

public class Test {

	public static void main(String[] args) {

		AbstractCustomer customer = CustomerFactory.getCustomer("zhang");
		System.out.println(customer.getName());
		AbstractCustomer customer2 = CustomerFactory.getCustomer("wagnwu");
		System.out.println(customer2.getName());
	}

}
