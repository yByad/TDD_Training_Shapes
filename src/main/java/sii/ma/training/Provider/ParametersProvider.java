package sii.ma.training.Provider;

public class ParametersProvider {

    private ParametersProvider() {

    }

    private static ParametersProvider INSTANCE = new ParametersProvider();

    public static ParametersProvider getInstance() {
	return INSTANCE;
    }

    public int[] retrieveDimensions(final String parameters) {

	final String[] stringParameters = parseParameters(parameters);
	final int[] result = convertFrom(stringParameters);
	return result;
    }

    private int[] convertFrom(final String[] parameters) {
	validateParameters(parameters);
	final int[] result = new int[parameters.length];
	for (int i = 0; i < parameters.length; i++) {
	    result[i] = new Integer(parameters[i]);
	}
	return result;
    }

    private String[] parseParameters(final String parameters) {
	final String[] params = parameters.split(",");
	return params;
    }

    private void validateParameters(final String[] parameters) {
	if (parameters.length != 1 && parameters.length != 2)
	    throw new IllegalArgumentException();
    }

}
