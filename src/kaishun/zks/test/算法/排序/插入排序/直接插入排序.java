package kaishun.zks.test.�㷨.����.��������;

import java.util.Arrays;

/*1������˼�룺ÿ����һ��������ļ�¼��
����˳�����С���뵽ǰ���Ѿ�����������еĺ���λ�ã��Ӻ���ǰ�ҵ�����λ�ú󣩣�
ֱ��ȫ������������Ϊֹ��*/
public class ֱ�Ӳ������� {

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
