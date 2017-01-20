package kaishun.zks.collectionutil;

import java.util.List;

public class ListUtil {
	
	/**
	 * list 中移除多个数据
	 */
	public static void removeAll(List<String> originalList,List<String> removeList){
		originalList.removeAll(removeList);
	}
}
