package kaishun.zks.test.���ģʽ.װ��ģʽ;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape){
		super(shape);
	}
	@Override
	public void draw() {
		super.draw();
		addMethod();
	}
	private void addMethod() {
		System.out.println("�������� red");
	}
}
