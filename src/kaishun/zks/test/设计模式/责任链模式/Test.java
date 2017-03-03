package kaishun.zks.test.设计模式.责任链模式;

public class Test {

	public static void main(String[] args) {
		AbstractLogger infoLogger=new INFOLogger(1,"info");
		AbstractLogger debugLogger=new DEBUGLogger(2,"debug");
		AbstractLogger errorLogger=new ERRORLogger(3,"error");
		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(infoLogger);
		
		
		errorLogger.logger(2, "message");
	}

}
