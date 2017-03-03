package kaishun.zks.test.设计模式.工厂模式;

public class Test {

	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		Shape circleShape = factory.getShape("circle");
		circleShape.draw();
		Shape shape = factory.getShape("rect");
		shape.draw();
	}

}
