package kaishun.zks.test.Á÷;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class »º³åÁ÷ {
	String url = "F:\\test\\test.txt";
	String url2 = "F:\\test\\test2.txt";

	@Test
	public void test1() {
		BufferedReader br = null;
		FileReader fr=null;
		try {
			fr=new FileReader(url);
			br=new BufferedReader(fr);
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2(){
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			fw=new FileWriter(url2);
			bw=new BufferedWriter(fw);
			bw.write("µ½µ×hello");
			bw.newLine();
			bw.write("kkkk");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
