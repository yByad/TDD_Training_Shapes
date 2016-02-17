package sii.ma.training.Provider;

public class ParametersProvider {

	private String parametersString;
	private String[] params;

	public ParametersProvider(final String parameters) {

		this.parametersString = parameters;
		params = parseParameters();
	}

	private String[] parseParameters() {
		final String[] params = parametersString.split(",");
		return params;
	}

	public int retrieveFirstParameter() {
		return new Integer(params[0]);
	}

	public int retrieveSecondarameter() {
		if (hasTwoParameters()) {
			return new Integer(params[1]);
		} else {
			return 0;
		}
	}

	private Boolean hasTwoParameters() {
		return (params.length > 1);
	}
}
