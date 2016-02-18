package sii.ma.training.Provider;

public class ParametersProvider {

    private ParametersProvider() {

    }

    private static ParametersProvider INSTANCE = new ParametersProvider();

    public static ParametersProvider getInstance() {
	return INSTANCE;
    }

    public int[] retrieveDimensions(final String parameters) {
	final int[] result = { 0, 0 };
	final String[] stringParameters = parseParameters(parameters);
	result[0] = retrieveFirstParameter(stringParameters);
	result[1] = retrieveSecondarameter(stringParameters);
	return result;
    }

    private String[] parseParameters(final String parameters) {
	final String[] params = parameters.split(",");
	return params;
    }

    private int retrieveFirstParameter(final String... parameters) {
	return new Integer(parameters[0]);
    }

    private int retrieveSecondarameter(final String... parameters) {
	if (hasTwoParameters(parameters)) {
	    return new Integer(parameters[1]);
	} else {
	    return 0;
	}
    }

    private Boolean hasTwoParameters(final String... parameters) {
	return (parameters.length > 1);
    }
}
