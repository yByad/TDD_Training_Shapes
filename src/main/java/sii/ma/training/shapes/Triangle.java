package sii.ma.training.shapes;

public class Triangle {

	private int height;
	private int base;
	

	String calculateArea(String HeightAndBase) {
		final String[] params = HeightAndBase.split(",");
		if(params.length == 1){
			base = Integer.parseInt(params[0]);
			final Integer area =  (base*base)/2;
			return area.toString()+"\n";
		}
		else{
		height = Integer.parseInt(params[1]);
		base = Integer.parseInt(params[0]);
		final Integer area =  (height*base)/2;
		
		return area.toString()+"\n";
		}
	}
}
