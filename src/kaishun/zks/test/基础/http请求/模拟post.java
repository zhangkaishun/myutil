package kaishun.zks.test.����.http����;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class ģ��post {

	public static void main(String[] args){
		 HttpClient client = new DefaultHttpClient();
		 try{
			 HttpPost post=new HttpPost("http://localhost:8080/quotation-rank-frontend/mobileHttpServlet");
		 
		 
		 
		 
		 
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	}
}
