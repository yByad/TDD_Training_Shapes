package sii.ma.training.area;

class FakePolygone implements Polygones {

    public int calculateArea() {
	throw new IllegalArgumentException();
    }

}
