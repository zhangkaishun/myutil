package kaishun.zks.test.算法.排序.插入排序;

import java.util.Arrays;

public class 插入排序 {

	public static void main(String[] args) {
		insertSort(new int[] { 2, 5, 3, 67, 55, 77 });
	}
	/**  
	 * 插入排序<br/>  
	 * <ul>  
	 * <li>从第一个元素开始，该元素可以认为已经被排序</li>  
	 * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>  
	 * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>  
	 * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>  
	 * <li>将新元素插入到该位置中</li>  
	 * <li>重复步骤2</li>  
	 * </ul>  
	 *   
	 * @param numbers   待排序数组
	 */  
	public static void insertSort(int[] numbers){
		int size=numbers.length,temp,j;
		for(int i=1;i<size;i++){
			temp=numbers[i];
			for(j=i;j>0&&temp<numbers[j-1];j--){
				numbers[j]=numbers[j-1];
			}
			numbers[j]=temp;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
