package kaishun.zks.collectionutil;

import java.util.List;

public class ListUtil {
	
	/**
	 * list ���Ƴ��������
	 */
	public static void removeAll(List<String> originalList,List<String> removeList){
		originalList.removeAll(removeList);
	}
}
