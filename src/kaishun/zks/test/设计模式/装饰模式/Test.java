package kaishun.zks.test.设计模式.装饰模式;

public class Test {
	
	public static void main(String[] args){
		Shape circleShape=new CircleShape();
		ShapeDecorator decorator=new RedShapeDecorator(circleShape);
		decorator.draw();
	}
}
