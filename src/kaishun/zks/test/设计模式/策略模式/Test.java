package kaishun.zks.test.���ģʽ.����ģʽ;

public class Test {

	public static void main(String[] args) {
		int result;
		Context context=new Context();
		Strategy strategySum=new OperationSum();
		context.setStrategy(strategySum);
		result=context.executeStrategy(3, 2);
		System.out.println(result);
		Strategy strategySub=new OperationSub();
		context.setStrategy(strategySub);
		result=context.executeStrategy(3, 2);
		System.out.println(result);
		
	}

}
