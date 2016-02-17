package sii.ma.training.shapes;

class Square {

	private int side;
	String calculateArea(final String sideString) {
		side = Integer.parseInt(sideString);
		final Integer area = side*side;
		return area.toString()+"\n" ;
		
	}

}
