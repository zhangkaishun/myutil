package kaishun.zks.test.�㷨.����.��������;

public class MergeSortTest {

	static int number = 0;

	public static void main(String[] args) {
		int[] a = { 14, 12, 15, 13, 11, 16 };
		printArray("����ǰ��", a);
		MergeSort(a);
		printArray("�����", a);
	}

	private static void printArray(String pre, int[] a) {
		System.out.print(pre + "\n");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
	}

	private static void MergeSort(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����");
		Sort(a, 0, a.length - 1);
	}

	private static void Sort(int[] a, int left, int right) {
		if (left >= right)
			return;

		int mid = (left + right) / 2;
		// ��·�鲢��������������Sort����·�鲢��������д���Sort�Ϳ�����
		Sort(a, left, mid);
		Sort(a, mid + 1, right);
		merge(a, left, mid, right);

	}

	private static void merge(int[] a, int left, int mid, int right) {

		int[] tmp = new int[a.length];
		int r1 = mid + 1;
		int tIndex = left;
		int cIndex = left;
		// ����鲢
		while (left <= mid && r1 <= right) {
			if (a[left] <= a[r1])
				tmp[tIndex++] = a[left++];
			else
				tmp[tIndex++] = a[r1++];
		}
		// �����ʣ��Ĺ鲢
		while (left <= mid) {
			tmp[tIndex++] = a[left++];
		}
		// ���ұ�ʣ��Ĺ鲢
		while (r1 <= right) {
			tmp[tIndex++] = a[r1++];
		}

		System.out.println("��" + (++number) + "������:\t");
		// TODO Auto-generated method stub
		// ����ʱ���鿽����ԭ����
		while (cIndex <= right) {
			a[cIndex] = tmp[cIndex];
			// ����м�鲢������
			System.out.print(a[cIndex] + "\t");
			cIndex++;
		}
		System.out.println();
	}

}