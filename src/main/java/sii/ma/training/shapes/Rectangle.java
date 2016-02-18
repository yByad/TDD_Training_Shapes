package sii.ma.training.shapes;

class Rectangle implements Polygones {

    private int width;
    private int length;

    Rectangle(final int[] dimensions) {

	width = dimensions[0];
	length = dimensions[1];
    }

    @Override
    public int calculateArea() {
	return new Integer(width * length);

    }

}
