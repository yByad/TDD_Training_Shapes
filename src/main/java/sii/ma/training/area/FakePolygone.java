package sii.ma.training.area;

class FakePolygone implements Polygones {

    @Override
    public int calculateArea() {
	throw new IllegalArgumentException();
    }

}
