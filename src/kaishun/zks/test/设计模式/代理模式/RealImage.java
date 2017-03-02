package kaishun.zks.test.设计模式.代理模式;

public class RealImage implements Image{

	@Override
	public void display() {
		System.out.println("hello RealImage");
	}

}
