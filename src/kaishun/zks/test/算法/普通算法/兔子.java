package kaishun.zks.test.�㷨.��ͨ�㷨;

/*��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
���ӵĹ���Ϊ����1,1,2,3,5,8,13,21��.*/
public class ���� {
	public static void main(String[] args){
		System.out.println(f(6));	
	}
	public static int f(int x){
		if(x==1||x==2){
			return 1;
		}
		return f(x-1)+f(x-2);
		
	}
}
