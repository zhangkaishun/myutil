package kaishun.zks.test.算法.排序.快速排序;

import java.util.Arrays;

import org.junit.Test;

public class 快速排序 {

	@Test
	public void test() {
		quickSort(new int[] { 13, 16, 24, 64, 7, 4, 55 }, 0, 6);
		//quickSort(new int[] { 15,14,17}, 0, 2);

	}

	
	
	/**
	 * 快速排序<br/>
	 * <ul>
	 * <li>从数列中挑出一个元素，称为“基准”</li>
	 * <li>重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
	 * 该基准是它的最后位置。这个称为分割（partition）操作。</li>
	 * <li>递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。</li>
	 * </ul>
	 * 
	 * @param numbers
	 * @param start
	 * @param end
	 */
	public static void quickSort(int[] numbers, int start, int end) {
		int baseData = numbers[start]; // 用于保存基准值
		int temp;
		int i = start;
		int j = end;
		do {
			while (numbers[i] < baseData && i < end)
				i++;
			while (numbers[j] > baseData && j > start)
				j--;
			if (i <= j) {
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j--;
			}
			System.out.println(Arrays.toString(numbers));

		} while (i <= j);
		System.out.println("i=:"+i+"j=:"+j);
		if (start < j) {
			quickSort(numbers, start, j);
		}
		if (end > i) {
			quickSort(numbers, i, end);
		}

		//System.out.println(Arrays.toString(numbers));
	}
}
