package kaishun.zks.test.算法.普通算法;

/*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
兔子的规律为数列1,1,2,3,5,8,13,21….*/
public class 兔子 {
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
