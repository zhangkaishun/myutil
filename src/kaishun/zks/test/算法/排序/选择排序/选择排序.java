package kaishun.zks.test.算法.排序.选择排序;

import java.util.Arrays;

public class 选择排序 {

	public static void main(String[] args) {

		selectSort(new int[] { 2, 5, 3, 67, 55, 77 });
	}

	/**
	 * 选择排序<br/>
	 * <li>在未排序序列中找到最小元素，存放到排序序列的起始位置</li> <li>再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。</li>
	 * <li>以此类推，直到所有元素均排序完毕。</li>
	 * 
	 * 
	 * @param numbers
	 *            待排序数组
	 */
	public static void selectSort(int[] numbers) {
		int temp;
		for (int i = 0; i < numbers.length - 1; i++) {
			int k = i;
			for (int j = numbers.length - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			temp = numbers[k];
			numbers[k] = numbers[i];
			numbers[i] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
