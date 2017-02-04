package kaishun.zks.test.»ù´¡.httpÇëÇó;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class Ä£Äâpost {

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
