package kaishun.zks.test.���ģʽ.����ģʽ;

public class Test {

	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		Shape circleShape = factory.getShape("circle");
		circleShape.draw();
		Shape shape = factory.getShape("rect");
		shape.draw();
	}

}
