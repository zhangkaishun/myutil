package kaishun.zks.test.�㷨.�ݹ�;

/**
 * 1,3,6,10,15,21,..............
 * ��������еĵ�n���ɵ�n-1���n�õ�
 * @author zhangkaishun
 *
 */
public class �������� {

	public static void main(String[] args) {
		System.out.println(compute(6));
	}

	public static int compute(int n){
		if(n==1){
			return 1;
		}
		return n+compute(n-1);
	}
}
