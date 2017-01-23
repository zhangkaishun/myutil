package kaishun.zks.test.基础.内部类;
/*方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化。

B、方法内部类对象不能使用该内部类所在方法的非final局部变量。
因为方法的局部变量位于栈上，只存在于该方法的生命期内。当一个方法结束，其栈结构被删除，
局部变量成为历史。但是该方法结束之后，在方法内创建的内部类对象可能仍然存在于堆中！
'例如，如果对它的引用被传递到其他某些代码，并存储在一个成员变量内。
正因为不能保证局部变量的存活期和方法内部类对象的一样长，所以内部类对象不能使用它们
C、方法内部类的修饰符。
与成员内部类不同，方法内部类更像一个局部变量。
可以用于修饰方法内部类的只有final和abstract。

D、静态方法内的方法内部类。
静态方法是没有this引用的，因此在静态方法内的内部类遭受同样的待遇，即：只能访问外部类的静态成员。*/

public class 方法内部类 {

	public void sayHello(){
		int i=0;
		class Inner{
			public void sayHellow(){
				System.out.println("方法内部类 hello world");
			}
		}
		Inner in=new Inner();
		in.sayHellow();
		
	}
	
	public static void main(String[] args) {
		方法内部类 outer=new 方法内部类();
		outer.sayHello();
	}

}
