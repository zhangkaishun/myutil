package kaishun.zks.test.�㷨.����.ѡ������;

import java.util.Arrays;

public class ѡ������ {

	public static void main(String[] args) {

		selectSort(new int[] { 2, 5, 3, 67, 55, 77 });
	}

	/**
	 * ѡ������<br/>
	 * <li>��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ��</li> <li>�ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ���������ĩβ��</li>
	 * <li>�Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�</li>
	 * 
	 * 
	 * @param numbers
	 *            ����������
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
