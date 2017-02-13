package kaishun.zks.test.»ù´¡.JSON;

import org.junit.Test;

import net.sf.json.JSONArray;

public class JSONTest {

	@Test
	public void testOne(){
		JSONArray jsonArray=new JSONArray();
		jsonArray.add("1");
		jsonArray.add("3");
		jsonArray.add("3");
		JSONArray jsonArrayTwo=new JSONArray();
		jsonArrayTwo.add(jsonArray);
		System.out.println(jsonArrayTwo.toString());
	}
}
