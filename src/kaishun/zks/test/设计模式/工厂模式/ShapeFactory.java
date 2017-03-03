package kaishun.zks.test.设计模式.工厂模式;

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
