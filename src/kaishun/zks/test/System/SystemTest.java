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
src:Դ���飻	srcPos:Դ����Ҫ���Ƶ���ʼλ�ã�
dest:Ŀ�����飻	destPos:Ŀ��������õ���ʼλ�ã�	length:���Ƶĳ��ȡ�*/
		
		String[] src=new String[]{"a","b","c","d","e"};
		String[] dest=new String[]{"f","g","h","i","j"};
		System.arraycopy(src, 0, dest, 0, src.length-1);
		System.out.println(Arrays.toString(dest));
	}
}
