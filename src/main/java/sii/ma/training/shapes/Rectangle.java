package sii.ma.training.shapes;

public class Rectangle {
	
	private int height;
	private int length;
	

	String calculateArea(String HeightAndLength) {
		final String[] params = HeightAndLength.split(",");
		height = Integer.parseInt(params[0]);
		length = Integer.parseInt(params[1]);
		final Integer area =  height*length;
		
		return area.toString()+"\n";
		
	}

}
