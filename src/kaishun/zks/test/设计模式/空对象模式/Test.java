package kaishun.zks.test.���ģʽ.�ն���ģʽ;

public class Test {

	public static void main(String[] args) {

		AbstractCustomer customer = CustomerFactory.getCustomer("zhang");
		System.out.println(customer.getName());
		AbstractCustomer customer2 = CustomerFactory.getCustomer("wagnwu");
		System.out.println(customer2.getName());
	}

}
