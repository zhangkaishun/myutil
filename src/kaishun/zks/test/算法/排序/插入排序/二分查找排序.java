package kaishun.zks.test.�㷨.����.��������;

import java.util.Arrays;

/*1������˼�룺���ַ����������˼���ֱ�Ӳ���һ����
 ֻ���Һ��ʵĲ���λ�õķ�ʽ��ͬ��
 �����ǰ����ַ��ҵ����ʵ�λ�ã����Լ��ٱȽϵĴ�����*/
public class ���ֲ������� {

	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			if (a[i - 1] > tmp) {
				int hight = i - 1;
				int low = 0;
				while (low <=hight) {
					if (a[(hight + low) / 2] < tmp) {
						low = ((hight + low) / 2) + 1;
					} else {
						hight = ((hight + low) / 2) - 1;
					}
				}
				for (int k = i; k >low; k--) {
					a[k] = a[k - 1];
				}
				a[low] = tmp;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
