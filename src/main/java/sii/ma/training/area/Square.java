package sii.ma.training.area;

import java.util.List;

class Square implements Polygones {

    private int side;

    Square(final List<Integer> shapeDimensions) {
	this.side = shapeDimensions.get(0);
    }

    @Override
    public int calculateArea() {

	return side * side;

    }

}
