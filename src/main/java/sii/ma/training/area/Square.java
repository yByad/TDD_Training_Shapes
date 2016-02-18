package sii.ma.training.area;

class Square implements Polygones {

    private int side;

    Square(final int[] side) {
	this.side = side[0];
    }

    @Override
    public int calculateArea() {

	return side * side;

    }

}
