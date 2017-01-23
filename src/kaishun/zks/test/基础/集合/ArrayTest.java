package kaishun.zks.test.»ù´¡.¼¯ºÏ;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {
	@Test
	public void testCopy(){
		int[] src=new int[]{1,2,8};
		int [] dest=new int[]{3,4,5};
		System.arraycopy(src, 0, dest, 0, dest.length);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));

	}
}
