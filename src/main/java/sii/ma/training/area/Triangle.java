package sii.ma.training.area;

import java.util.List;

class Triangle implements Polygones {

    private int height;
    private int base;

    public Triangle(int base) {

	this.base = base;
	this.height = base;
    }

    public Triangle(List<Integer> dimensions) {
	this.height = dimensions.get(0);
	this.base = dimensions.get(1);
    }

    @Override
    public int calculateArea() {
	return (height * base) / 2;

    }

}
