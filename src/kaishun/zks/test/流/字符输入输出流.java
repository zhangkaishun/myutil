package kaishun.zks.test.��;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class �ַ���������� {
	String url = "F:\\test\\test.txt";
	String url2 = "F:\\test\\test2.txt";
	@Test
	public void test(){
		FileReader fr=null;
		try{
		 fr=new FileReader(url);
		int b;
		while((b=fr.read())!=-1){
			System.out.println((char)b);
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	@Test
	public void test2(){
		FileReader fr=null;
		try{
		 fr=new FileReader(url);
		char[] b=new char[1024];
		int k=0;
		while((k=fr.read(b,0,1024))!=-1){
			System.out.println(new String(b,0,k));
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3(){
		FileWriter fw=null;
		try{
		 fw=new FileWriter(url2);
		 fw.write(new char[]{'s','��'});
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
