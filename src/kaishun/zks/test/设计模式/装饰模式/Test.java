package kaishun.zks.test.���ģʽ.װ��ģʽ;

public class Test {
	
	public static void main(String[] args){
		Shape circleShape=new CircleShape();
		ShapeDecorator decorator=new RedShapeDecorator(circleShape);
		decorator.draw();
	}
}
