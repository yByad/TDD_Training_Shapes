package sii.ma.training.area;

import java.util.List;

public class ShapesFactory {
    private ShapesFactory() {
    }

    private static ShapesFactory INSTANCE = new ShapesFactory();

    public static ShapesFactory getInstance() {
	return INSTANCE;
    }

    public Polygones createShape(final String ShapeType, final List<Integer> shapeDimensions) {
	switch (ShapeType) {
	case "SQUARE":
	    return new Square(shapeDimensions);

	case "RECTANGLE":
	    return new Rectangle(shapeDimensions);

	case "TRIANGLE":
	    if (shapeDimensions.size() > 1)
		return new Triangle(shapeDimensions);
	    else
		return new Triangle(shapeDimensions.get(0));
	default:
	    return new FakePolygone();

	}
    }

}
