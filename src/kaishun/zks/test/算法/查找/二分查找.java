package kaishun.zks.test.算法.查找;

public class 二分查找 {

	public static void main(String[] args) {
		int[] a = { 1,2,5,7,8,38,65,68,88};
		System.out.println(binarySearch(a,38));
	}

	
	/**
	 * 二分查找算法 非递归
	 * @param dataArray 待查找数组
	 * @param searchData 需要从数组中查找的数据
	 * @return 在数组中的位置
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
