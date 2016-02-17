package sii.ma.training.shapes;

import java.io.StringWriter;

public class Shapes {

	private StringWriter out;

	public Shapes(final StringWriter out) {
		this.out = out;

	}

	public void area(final String ShapeType, final String Parameters) {

		switch (ShapeType) {
		case "SQUARE":
			final Square square = new Square(Parameters);
			out.write(square.calculateArea());
			break;
		case "RECTANGLE":
			final Rectangle rectangle = new Rectangle(Parameters);
			out.write(rectangle.calculateArea());
			break;
		case "TRIANGLE":
			final Triangle triangle = new Triangle(Parameters);
			out.write(triangle.calculateArea());
			break;

		default:
			break;
		}
	}

}
