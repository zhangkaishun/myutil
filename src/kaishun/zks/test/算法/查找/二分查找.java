package kaishun.zks.test.�㷨.����;

public class ���ֲ��� {

	public static void main(String[] args) {
		int[] a = { 1,2,5,7,8,38,65,68,88};
		System.out.println(binarySearch(a,38));
	}

	
	/**
	 * ���ֲ����㷨 �ǵݹ�
	 * @param dataArray ����������
	 * @param searchData ��Ҫ�������в��ҵ�����
	 * @return �������е�λ��
	 */
	public static int binarySearch(int[] dataArray,int searchData){
		int low=0;
		int high=dataArray.length-1;
		while(low<=high){
			System.out.println(low+"----"+high);
			int middle=(high+low)/2;
			if(dataArray[middle]<searchData){
				low=middle+1;
				continue;
			}
			if(dataArray[middle]>searchData){
				high=middle-1;
				continue;
			}
			return middle;
			
		}
		
		return 0;
	}
}
