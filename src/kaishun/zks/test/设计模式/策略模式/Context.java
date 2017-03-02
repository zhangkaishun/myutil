package kaishun.zks.test.设计模式.策略模式;

public class Context {

	private Strategy strategy;

	public Context() {
	};

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int number1,int number2){
		return this.strategy.doOperation(number1, number2);
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}

