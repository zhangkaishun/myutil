package kaishun.zks.test.collectionutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class MapUtilTest {

	/**
	 * HashMap����value����
	 */
	@Test
	public void sortByValue(){
		Map<String,String> map=new HashMap<String,String>();
		map.put("1","5");
		map.put("2","4");
		map.put("7","8");
		map.put("6","6");
		map.put("3","2");
		System.out.println(map);
		List<Map.Entry<String,String>> list=new ArrayList<Map.Entry<String,String>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1,
					Entry<String, String> o2) {
				//�޸������ʵ��������,����key����value������
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("�����");
		for(Map.Entry<String, String> entry:list){
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
	}
	
	/**
	 * treeMap ����key ��������
	 */
	@Test
	public void sortByKeyDESC(){
		Map<String,String> map=new TreeMap<String,String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			};
		});
		map.put("1","5");
		map.put("2","4");
		map.put("7","8");
		map.put("6","6");
		map.put("3","2");
		System.out.println(map);
		
		
	}
	
}
