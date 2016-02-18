package sii.ma.training.shapes;

class Triangle implements Polygones {

    private int height;
    private int base;

    public Triangle(int... dimensions) {

	this.base = dimensions[0];
	this.height = dimensions[1];
    }

    @Override
    public int calculateArea() {

	if (triangleIsDegraded()) {
	    return new Integer((base * base) / 2);
	} else {
	    return new Integer((height * base) / 2);
	}
    }

    private Boolean triangleIsDegraded() {

	return height == 0;
    }
}
