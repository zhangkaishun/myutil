package kaishun.zks.test.算法.全排列;

import java.util.Arrays;

public class 全排列 {

	public static void main(String[] args) {

			char[] a={'a','b','c','d'};
			range(a,0);
			
	}
	
	public static void range(char[] a,int start){
	if(a.length==start){
		System.out.println(a);
	}
	char[] tmp=Arrays.copyOf(a, a.length);
	for(int i=start;i<a.length;i++){
		char temp=a[start];
		tmp[start]=a[i];
		tmp[i]=temp;
		range(tmp,start+1);
	}
		
	}
}
