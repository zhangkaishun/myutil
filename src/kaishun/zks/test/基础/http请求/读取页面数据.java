package kaishun.zks.test.����.http����;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ��ȡҳ������ {
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
			// �����Ƿ���connection�������Ϊ�����post���󣬲���Ҫ����
			// http�����ڣ������Ҫ��Ϊtrue
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			  // Post ������ʹ�û���
	        connection.setUseCaches(false);
	        
	        // ���ӣ���postUrl.openConnection()���˵����ñ���Ҫ��connect֮ǰ��ɣ�
	        // Ҫע�����connection.getOutputStream�������Ľ���connect��
	        connection.connect();
			DataOutputStream dataout = new DataOutputStream(
					connection.getOutputStream());

			dataout.write("<?xmlversion='1.0'encoding='GB2312'?><MEBS><REQ name='tzprank'><N>10</N></REQ></MEBS>"
					.getBytes());
			dataout.flush();
			dataout.close();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			while ((b = reader.readLine()) != null) {
				System.out.println(b);
			}
			System.out.println("����");
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
