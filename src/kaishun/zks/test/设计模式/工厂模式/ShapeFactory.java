package kaishun.zks.test.���ģʽ.����ģʽ;

public class ShapeFactory {

	public Shape getShape(String type) {
		if (type.equalsIgnoreCase("circle")) {
			return new CircleShape();
		} else if (type.equalsIgnoreCase("rect")) {
			return new RectShape();
		} else {
			return null;
		}
	}
}
