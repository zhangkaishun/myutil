package kaishun.zks.test.流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class 文件字节输入输出流 {

	String url = "F:\\test\\test.txt";
	String url2 = "F:\\test\\test2.txt";
	@Test
	public void test() {
		try {
			FileInputStream in = new FileInputStream(url);
			FileOutputStream out=new FileOutputStream(url2,true);
			byte[] array=new byte[1024];
			int b=array.length;
			while((b=in.read(array,0,1024))!=-1){
				String s=new String(array);
				System.out.println(s);
				out.write(array, 0, b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
