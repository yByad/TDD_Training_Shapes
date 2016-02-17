package sii.ma.training.shapes;
import java.io.StringWriter;

public class Shapes {

	private StringWriter out;
	public Shapes(StringWriter out) {
		this.out = out;
		
	}

	public void area(String ShapeType, String Parameters) {
		
	switch (ShapeType) {
	case "SQUARE":
		
			out.write(new Square().calculateArea(Parameters));
		break;
	case "RECTANGLE":
		
			out.write(new Rectangle().calculateArea(Parameters));
		break;
		case "TRIANGLE":
		
			out.write(new Triangle().calculateArea(Parameters));
		break;

	default:
		break;
	}
	}

}
