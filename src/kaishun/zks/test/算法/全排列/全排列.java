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
		swap(tmp,i,start);
		range(tmp,start+1);
		swap(tmp,start,i);
		
	}
	}
	
	  public static void swap(char[] s,int i,int j) {
	        char tmp = s[i];
	        s[i] = s[j];
	        s[j] = tmp;
	    }
}
