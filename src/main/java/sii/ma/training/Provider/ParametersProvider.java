package sii.ma.training.Provider;

public class ParametersProvider {

	
	private String parametersString;
	
	
	
	
	public ParametersProvider(final String parametersString) {
		
		this.parametersString = parametersString;
	}
	
	private String[] parseParameters(){
		
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
