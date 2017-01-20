package kaishun.zks.test.collectionutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import kaishun.zks.collectionutil.ListUtil;

import org.junit.Test;

public class ListUtilTest {

	/**
	 * list�Ƴ����Ԫ��
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
	
	/**
	 * list ����ʲô˳�򣬾���ʲô˳�򣬵���Ҳ�ɰ������˳���������
	 */
	@Test
	public void testSort(){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(4);
		System.out.println(Arrays.toString(list.toArray()));
		Collections.reverse(list);
		System.out.println(Arrays.toString(list.toArray()));
		
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		
		/*Collections.sort(list,Collections.reverseOrder(new Comparator<Integer>() {
			@Override						//���ձȽ����෴��˳��
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		}));*/
		System.out.println(Arrays.toString(list.toArray()));

		
	}
}
