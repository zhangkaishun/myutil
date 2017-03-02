package kaishun.zks.test.算法.递归;

/**
 * 1,3,6,10,15,21,..............
 * 这个数列中的第n项由第n-1项加n得到
 * @author zhangkaishun
 *
 */
public class 三角数字 {

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
