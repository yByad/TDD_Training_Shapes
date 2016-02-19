package sii.ma.training.facade;

import java.io.StringWriter;
import java.util.List;

import sii.ma.training.Provider.ParametersProvider;
import sii.ma.training.area.Formatter;
import sii.ma.training.area.Polygones;
import sii.ma.training.area.ShapesFactory;

public class Shapes {

    private Formatter format;
    private ParametersProvider provider;
    private ShapesFactory factory;

    public Shapes(final StringWriter out) {
	this.format = new OutFormatter(out);
	factory = ShapesFactory.getInstance();
	provider = ParametersProvider.getInstance();

    }

    public void area(final String ShapeType, final String dimensions) {
	final List<Integer> shapeDimensions = provider.retrieveDimensions(dimensions);
	final Polygones shape = factory.createShape(ShapeType, shapeDimensions);
	final int area = shape.calculateArea();
	format.write(area);
    }

}
