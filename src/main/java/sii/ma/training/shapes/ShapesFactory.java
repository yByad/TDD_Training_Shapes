package sii.ma.training.shapes;

public class ShapesFactory {
	private ShapesFactory() {
	}

	private static ShapesFactory INSTANCE = new ShapesFactory();

	public static ShapesFactory getInstance() {
		return INSTANCE;
	}

	public Polygones createShape(final String ShapeType, final int[] dimensions) {
		switch (ShapeType) {
		case "SQUARE":
			return new Square(dimensions);
			
		case "RECTANGLE":
			return new Rectangle(dimensions);
			
		case "TRIANGLE":
			return new Triangle(dimensions);
			

		default:
			return new FakePolygone();
			
		}
	}

}
