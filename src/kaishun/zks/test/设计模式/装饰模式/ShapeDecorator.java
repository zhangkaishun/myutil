package kaishun.zks.test.���ģʽ.װ��ģʽ;

public class ShapeDecorator implements Shape{
	
	private Shape shape;
	
	public ShapeDecorator(Shape shape){
		this.shape=shape;
	}
	@Override
	public void draw() {
		shape.draw();
	}
}
