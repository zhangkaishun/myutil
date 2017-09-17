package kaishun.zks.test.��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import org.junit.Test;

public class �ֽ����ַ���ת�� {
	String url = "F:\\test\\test.txt";
	String url2 = "F:\\test\\test2.txt";
	
	/**
	 * �ֽ���ת��Ϊ�ַ���
	 */
	@Test
	public void transReadNoBuff(){
		try{
		InputStream in=new FileInputStream(url);
		InputStreamReader isr=new InputStreamReader(in);
		char[] array=new char[1024];
		int b;
		while((b=isr.read(array, 0, 1024))!=-1){
			System.out.println(Arrays.toString(array));
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void transReadWithBuff(){
		try{
		InputStream in=new FileInputStream(url);
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader reader=new BufferedReader(isr);
		String b;
		while((b=reader.readLine())!=null){
			System.out.println(b);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void transWriteNoBuff(){
		
		try{
			OutputStream out=new FileOutputStream(url);
			OutputStreamWriter osw=new OutputStreamWriter(out);
			osw.write("hello");
			osw.write("����˭");
			osw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void transWriteWithBuff(){
		
		try{
			OutputStream out=new FileOutputStream(url);
			OutputStreamWriter osw=new OutputStreamWriter(out);
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write("hello2");
			bw.write("����˭");
			bw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
