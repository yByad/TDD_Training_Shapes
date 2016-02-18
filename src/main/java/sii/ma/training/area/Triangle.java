package sii.ma.training.area;

class Triangle implements Polygones {

    private int height;
    private int base;

    public Triangle(int base) {

	this.base = base;
	this.height = base;
    }

    public Triangle(int... dimensions) {
	this.height = dimensions[1];
	this.base = dimensions[0];
    }

    @Override
    public int calculateArea() {
	return (height * base) / 2;

    }

}
