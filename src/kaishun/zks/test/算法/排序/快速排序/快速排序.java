package kaishun.zks.test.�㷨.����.��������;

import java.util.Arrays;

import org.junit.Test;

public class �������� {

	@Test
	public void test() {
		quickSort(new int[] { 13, 16, 24, 64, 7, 4, 55 }, 0, 6);
		//quickSort(new int[] { 15,14,17}, 0, 2);

	}

	/**
	 * ��������<br/>
	 * <ul>
	 * <li>������������һ��Ԫ�أ���Ϊ����׼��</li>
	 * <li>�����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ���������ָ�֮��
	 * �û�׼���������λ�á������Ϊ�ָpartition��������</li>
	 * <li>�ݹ�ذ�С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������</li>
	 * </ul>
	 * 
	 * @param numbers
	 * @param start
	 * @param end
	 */
	public static void quickSort(int[] numbers, int start, int end) {
		int baseData = numbers[start]; // ���ڱ����׼ֵ
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
		if (start < j) {
			quickSort(numbers, start, j);
		}
		if (end > i) {
			quickSort(numbers, i, end);
		}

		//System.out.println(Arrays.toString(numbers));
	}
}
