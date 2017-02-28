package kaishun.zks.test.�㷨.����.�鲢����;

import java.util.Arrays;

public class �鲢���� {

	public static void main(String[] args) {
		int[] a = { 14, 12, 15, 13, 11, 16 };
		System.out.println("����ǰ");
		System.out.println(Arrays.toString(a));
		MergeSort(a);
		System.out.println("����ǰ");
		System.out.println(Arrays.toString(a));
	}

	private static void MergeSort(int[] a) {
		System.out.println("��ʼ����");
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

		int rightIndex = middle + 1; // �ڶ��������±�
		int leftIndex = left; // ��һ�������±�
		int tIndex = left; // ��ʱ�����±�
		int[] temp = new int[a.length]; // ���ڴ����ʱ������
		// ����鲢
		while (left <= middle && rightIndex <= right) {
			if (a[left] <= a[rightIndex]) {
				temp[tIndex++] = a[left++];
			} else {
				temp[tIndex++] = a[rightIndex++];
			}
		}
		// �����ʣ��鲢
		while (left <= middle) {
			temp[tIndex++] = a[left++];
		}
		// ���ұ�ʣ��鲢
		while (rightIndex <= right) {
			temp[tIndex++] = a[rightIndex++];
		}
		// ����ʱ�������ݿ�����ԭ������
		while (leftIndex <= right) {
			a[leftIndex] = temp[leftIndex];
			leftIndex++;
		}

	}

}
