package kaishun.zks.test.基础.集合;

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
	 * HashMap按照value排序
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
				//修改这里可实现升序降序,按照key或者value来排序
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("排序后");
		for(Map.Entry<String, String> entry:list){
			System.out.println(entry.getKey()+"----"+entry.getValue());
		}
	}
	
	/**
	 * treeMap 按照key 降序排序
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
