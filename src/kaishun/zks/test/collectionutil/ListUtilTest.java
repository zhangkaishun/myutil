package kaishun.zks.test.collectionutil;

import java.util.ArrayList;
import java.util.List;

import kaishun.zks.collectionutil.ListUtil;

import org.junit.Test;

public class ListUtilTest {

	/**
	 * listÒÆ³ý¶à¸öÔªËØ
	 */
	@Test
	public void testRemoveAll(){
		
		List<String> originalList=new ArrayList<String>();
		originalList.add("1");
		originalList.add("2");
		originalList.add("6");
		originalList.add("4");
		List<String> removeList=new ArrayList<String>();
		removeList.add("2");
		removeList.add("4");
		ListUtil.removeAll(originalList, removeList);
		System.out.println(originalList);
		System.out.println(removeList);
	}
	
	@Test
	public void testClone(){
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("6");
		list.add("4");
		
	}
}
