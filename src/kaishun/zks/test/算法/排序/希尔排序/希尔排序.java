package kaishun.zks.test.�㷨.����.ϣ������;

import java.util.Arrays;

/**
 * ϣ������
 * http://www.cnblogs.com/0201zcr/p/4764427.html
 * @author hasee
 *
 */
public class ϣ������ {

	public static void main(String[] args) {
		int[] array=new int[]{3,5,8,32,6,4,9,2,7};
		shellSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void shellSort(int[] array){
		int j=0;
		int temp=0;
		for(int increment=array.length/2;increment>0;increment--){
			for(int i=increment;i<array.length;i++){
				temp=array[i];
				for(j=i;j>=increment;j-=increment){
					if(temp>array[j-increment]){
						array[j]=array[j-increment];
					}else{
						break;
					}
				}
				array[j]=temp;
				
				
			}
			
			
		}
	}

}
