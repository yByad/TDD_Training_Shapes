package sii.ma.training.shapes;

import java.io.StringWriter;

import sii.ma.training.Provider.ParametersProvider;

public class Shapes {

    private StringWriter out;
    private ParametersProvider provider;
    private ShapesFactory factory;

    public Shapes(final StringWriter out) {
	this.out = out;
	factory = ShapesFactory.getInstance();
	provider = ParametersProvider.getInstance();

    }

    public void area(final String ShapeType, final String dimensions) {
	final int[] shapeDimensions = provider.retrieveDimensions(dimensions);
	final Polygones shape = factory.createShape(ShapeType, shapeDimensions);
	out.write(shape.calculateArea() + "\n");
    }

}
