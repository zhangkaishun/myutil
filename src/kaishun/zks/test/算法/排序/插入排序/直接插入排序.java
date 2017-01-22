package kaishun.zks.test.算法.排序.插入排序;

import java.util.Arrays;

/*1、基本思想：每步将一个待排序的记录，
按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），
直到全部插入排序完为止。*/
public class 直接插入排序 {

	public static void main(String[] args){
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
        for(int i=1;i<a.length;i++){
        	int temp=a[i];
        	int k;
        	for(k=i-1;k>=0;k--){
        		if(a[k]>temp){
        			a[k+1]=a[k];
        		}else{
        			break;
        		}
        	}
        	a[k+1]=temp;
        }
        System.out.println(Arrays.toString(a));
	}
}
