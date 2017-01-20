package kaishun.zks.test.System;

import java.util.Arrays;

import org.junit.Test;

public class SystemTest {

	@Test
	public void arrayCopy(){
/*                int srcPos,
                Object dest,
                int destPos,
                int length)
src:源数组；	srcPos:源数组要复制的起始位置；
dest:目的数组；	destPos:目的数组放置的起始位置；	length:复制的长度。*/
		
		String[] src=new String[]{"a","b","c","d","e"};
		String[] dest=new String[]{"f","g","h","i","j"};
		System.arraycopy(src, 0, dest, 0, src.length-1);
		System.out.println(Arrays.toString(dest));
	}
}
