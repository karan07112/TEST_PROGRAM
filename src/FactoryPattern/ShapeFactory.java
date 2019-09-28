package FactoryPattern;

public class ShapeFactory {

	public Shape getShape(String shape) {

		if (shape == null) {

			return null;
		} else if (shape.equalsIgnoreCase("circle")) {

			return new Circle();

		} else if (shape.equalsIgnoreCase("triangle")) {

			return new Triangle();

		} else if (shape.equalsIgnoreCase("square")) {

			return new Square();

		}

		return null;

	}

}
