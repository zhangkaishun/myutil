package kaishun.zks.test.设计模式.装饰模式;

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
		System.out.println("新增方法 red");
	}
}
