package kaishun.zks.test.算法.排序.插入排序;

import java.util.Arrays;

/*1、基本思想：二分法插入排序的思想和直接插入一样，
 只是找合适的插入位置的方式不同，
 这里是按二分法找到合适的位置，可以减少比较的次数。*/
public class 二分查找排序 {

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
