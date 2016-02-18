package sii.ma.training.Provider;

public class ParametersProvider {

    private String[] params;

    public ParametersProvider(final String parameters) {

	params = parseParameters(parameters);
    }

    public int[] retrieveDimensions() {
	final int[] result = { 0, 0 };
	result[0] = retrieveFirstParameter();
	result[1] = retrieveSecondarameter();
	return result;
    }

    private String[] parseParameters(final String parameters) {
	final String[] params = parameters.split(",");
	return params;
    }

    private int retrieveFirstParameter() {
	return new Integer(params[0]);
    }

    private int retrieveSecondarameter() {
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
