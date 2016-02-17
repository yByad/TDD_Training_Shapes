package sii.ma.training.shapes;

public class Rectangle {

	private int width;
	private int length;

	Rectangle(final String widthAndLength) {
		final String[] params = widthAndLength.split(",");
		width = Integer.parseInt(params[0]);
		length = Integer.parseInt(params[1]);
	}

	String calculateArea() {
		return new Integer(width * length).toString() + "\n";

	}

}
