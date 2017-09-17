package kaishun.zks.test.线程;

import org.junit.Test;

/*public class Demo1 {     
    
    public synchronized void m1(){     
        //...............     
    }     
    
    public void m2(){     
        //............     
    
        synchronized(this){     
            //.........     
        }     
    
        //........     
    }     
} */
public class 线程测试 {

	@Test
	public void testOne(){
		Thread thread=new Thread(new MyThreadOne());
		
		
	}
}
