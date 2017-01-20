package kaishun.zks.test.collectionutil;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {
	@Test
	public void testOne(){
		int[] arrayOne=new int[]{1,2};
		int [] arrayTwo=arrayOne;
		arrayTwo[0]=5;
		System.out.println(Arrays.toString(arrayOne));
		System.out.println(Arrays.toString(arrayTwo));

		
	}
}
