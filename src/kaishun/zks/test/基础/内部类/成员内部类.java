package kaishun.zks.test.基础.内部类;

/*
对于普通的类，可用的修饰符有final、abstract、strictfp、public和默认的包访问。
但是成员内部类更像一个成员变量和方法。
可用的修饰符有：final、abstract、public、private、protected、strictfp和static。
一旦用static修饰内部类，它就变成静态内部类了*/
public class 成员内部类 {

	String name;
	public class Inner{
		public int i;
		public int j;
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public int getJ() {
			return j;
		}
		public void setJ(int j) {
			this.j = j;
		}
		public void sayHello(){
			System.out.println(this); //引用Inner 当前对象
			System.out.println(成员内部类.this); //引用 成员内部类当前对象
			System.out.println("成员内部类 hello world");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args){
		成员内部类 outer=new 成员内部类();
		成员内部类.Inner in = outer.new Inner();
		//成员内部类.Inner inTwo=new 成员内部类().new Inner(); 此行可代替前面两行
		in.sayHello();
		
	}
	
}
