package sii.ma.training.shapes;

public class Rectangle {
	
	private int width;
	private int length;
	

	String calculateArea(final String HeightAndLength) {
		final String[] params = HeightAndLength.split(",");
		width = Integer.parseInt(params[0]);
		length = Integer.parseInt(params[1]);
		final Integer area =  width*length;
		
		return area.toString()+"\n";
		
	}

}
