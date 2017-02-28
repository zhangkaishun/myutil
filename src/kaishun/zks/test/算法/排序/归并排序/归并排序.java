package kaishun.zks.test.算法.排序.归并排序;

import java.util.Arrays;

public class 归并排序 {

	public static void main(String[] args) {
		int[] a = { 14, 12, 15, 13, 11, 16 };
		System.out.println("排序前");
		System.out.println(Arrays.toString(a));
		MergeSort(a);
		System.out.println("排序前");
		System.out.println(Arrays.toString(a));
	}

	private static void MergeSort(int[] a) {
		System.out.println("开始排序");
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}
		int middle = (left + right) / 2;
		sort(a, left, middle);
		sort(a, middle + 1, right);
		merge(a, left, middle, right);

	}

	private static void merge(int[] a, int left, int middle, int right) {

		int rightIndex = middle + 1; // 第二段序列下标
		int leftIndex = left; // 第一段序列下标
		int tIndex = left; // 临时数组下标
		int[] temp = new int[a.length]; // 用于存放临时排序结果
		// 逐个归并
		while (left <= middle && rightIndex <= right) {
			if (a[left] <= a[rightIndex]) {
				temp[tIndex++] = a[left++];
			} else {
				temp[tIndex++] = a[rightIndex++];
			}
		}
		// 将左边剩余归并
		while (left <= middle) {
			temp[tIndex++] = a[left++];
		}
		// 将右边剩余归并
		while (rightIndex <= right) {
			temp[tIndex++] = a[rightIndex++];
		}
		// 将零时数组数据拷贝到原数组中
		while (leftIndex <= right) {
			a[leftIndex] = temp[leftIndex];
			leftIndex++;
		}

	}

}
