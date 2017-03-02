package kaishun.zks.test.�㷨.����;

public class ���ֲ��� {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 7, 8, 38, 65, 68, 88 };
		// System.out.println(binarySearch(a,38));
		System.out.println(search(a, 8, 0, 8));
	}

	/**
	 * ���ֲ��ҵݹ�ʵ��
	 * @param dataArray
	 * @param searchData
	 * @param low
	 * @param high
	 * @return
	 */
	public static int search(int[] dataArray, int searchData, int low, int high) {

		if (low == high) {
			return low;
		}
		int middle = (low + high) / 2;
		if (dataArray[middle] > searchData) {
			return search(dataArray, searchData, low, middle-1);
		}
		if (dataArray[middle] < searchData) {
			return search(dataArray, searchData, middle+1, high);
		}
		return middle;
	}

	/**
	 * ���ֲ����㷨 �ǵݹ�
	 * 
	 * @param dataArray
	 *            ����������
	 * @param searchData
	 *            ��Ҫ�������в��ҵ�����
	 * @return �������е�λ��
	 */
	public static int binarySearch(int[] dataArray, int searchData) {
		int low = 0;
		int high = dataArray.length - 1;
		while (low <= high) {
			System.out.println(low + "----" + high);
			int middle = (high + low) / 2;
			if (dataArray[middle] < searchData) {
				low = middle + 1;
				continue;
			}
			if (dataArray[middle] > searchData) {
				high = middle - 1;
				continue;
			}
			return middle;

		}

		return 0;
	}
}
