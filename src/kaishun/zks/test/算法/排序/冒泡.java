package kaishun.zks.test.�㷨.����;

import java.util.Arrays;

import org.junit.Test;

public class ð�� {

	@Test
	public void test() {
		int[] array = new int[] { 2, 6, 98, 56, 4, 8, 15, 66 };
		for (int i = 0; i < array.length - 1; i++) {
			int temp = array[i];
			for (int k = i + 1; k < array.length; k++) {
				if (temp > array[k]) {
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(array));

	}
}
