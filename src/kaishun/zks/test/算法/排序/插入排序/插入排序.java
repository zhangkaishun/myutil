package kaishun.zks.test.�㷨.����.��������;

import java.util.Arrays;

public class �������� {

	public static void main(String[] args) {
		insertSort(new int[] { 2, 5, 3, 67, 55, 77 });
	}
	/**  
	 * ��������<br/>  
	 * <ul>  
	 * <li>�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������</li>  
	 * <li>ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ��</li>  
	 * <li>�����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��</li>  
	 * <li>�ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��</li>  
	 * <li>����Ԫ�ز��뵽��λ����</li>  
	 * <li>�ظ�����2</li>  
	 * </ul>  
	 *   
	 * @param numbers   ����������
	 */  
	public static void insertSort(int[] numbers){
		int size=numbers.length,temp,j;
		for(int i=1;i<size;i++){
			temp=numbers[i];
			for(j=i;j>0&&temp<numbers[j-1];j--){
				numbers[j]=numbers[j-1];
			}
			numbers[j]=temp;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
