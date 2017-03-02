package kaishun.zks.test.设计模式.策略模式;

public class OperationMul implements Strategy{

	@Override
	public int doOperation(int number1, int number2) {
		return number1/number2;
	}

}
