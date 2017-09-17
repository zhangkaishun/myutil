package kaishun.zks.test;

public class TestMy {

	private static TestMy my=null;
	private TestMy(){};
	
	public static TestMy getInstance(){
		if(my==null){
			synchronized (TestMy.class) {
				my=new TestMy();
			}
			
		}
		return my;
		
		
	}
}
