package sii.ma.training.area;

import java.util.List;

class Rectangle implements Polygones {

    private int width;
    private int length;

    Rectangle(final List<Integer> shapeDimensions) {

	width = shapeDimensions.get(0);
	length = shapeDimensions.get(1);
    }

    @Override
    public int calculateArea() {
	return width * length;

    }

}
