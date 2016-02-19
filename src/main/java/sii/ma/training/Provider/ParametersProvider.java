package sii.ma.training.Provider;

import java.util.ArrayList;
import java.util.List;

public class ParametersProvider {

    private ParametersProvider() {

    }

    private static ParametersProvider INSTANCE = new ParametersProvider();

    public static ParametersProvider getInstance() {
	return INSTANCE;
    }

    public List<Integer> retrieveDimensions(final String parameters) {

	final String[] stringParameters = parseParameters(parameters);
	final List<Integer> result = convertFrom(stringParameters);
	return result;
    }

    private List<Integer> convertFrom(final String[] parameters) {
	validateParameters(parameters);
	final List<Integer> result = new ArrayList<Integer>();
	for (int i = 0; i < parameters.length; i++) {
	    result.add(new Integer(parameters[i]));
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
