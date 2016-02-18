package sii.ma.training.area;

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
	    if (dimensions.length > 1)
		return new Triangle(dimensions);
	    else
		return new Triangle(dimensions[0]);

	default:
	    return new FakePolygone();

	}
    }

}
