package kaishun.zks.test.基础.http请求;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import org.junit.Test;

public class 读取页面数据 {
/*	public static String path = "http://localhost:8080/quotation-rank-frontend/mobileHttpServlet";
*/
	public static String path = "http://localhost:8080/quotation-rank-frontend/mobileHttpServlet";
	@Test
	public void getUrlResource() {
		InputStream in = null;
		OutputStream out = null;
		byte[] array = new byte[1024];
		String b;
		try {
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			// 设置是否向connection输出，因为这个是post请求，参数要放在
			// http正文内，因此需要设为true
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			  // Post 请求不能使用缓存
	        connection.setUseCaches(false);
	        
	        // 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
	        // 要注意的是connection.getOutputStream会隐含的进行connect。
	        connection.connect();
			DataOutputStream dataout = new DataOutputStream(
					connection.getOutputStream());

			dataout.write("<?xmlversion='1.0'encoding='UTF-8'?><MEBS><REQ name='ztzprank'><N>10</N></REQ></MEBS>".getBytes());
			//dataout.write("<?xmlversion='1.0' encoding='UTF-8'?><MEBS><REQ name='ddrank'><N>-1</N></REQ></MEBS>".getBytes());
			dataout.flush();
			dataout.close();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			while ((b = reader.readLine()) != null) {
				System.out.println(b);
			}
			System.out.println("结束");
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
