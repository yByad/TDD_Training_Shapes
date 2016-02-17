package sii.ma.training.shapes;

public class ParametersProvider {

	
	private String parametersString;
	
	
	
	
	public ParametersProvider(String parametersString) {
		
		this.parametersString = parametersString;
	}
	
	public String[] parseParameters(){
		
		final String[] params = parametersString.split(",");
		return params;

		
	}
	public int retrieveFirstParameter(){
		final String [] params = parseParameters();
		return new Integer(params[0]);
	}
	public int retrieveSecondarameter(){

		final String [] params = parseParameters();

		if (params.length>1)
			return new Integer(params[1]);

		else 
			return 0;
	}
}
