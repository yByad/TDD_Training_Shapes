package sii.ma.training.shapes;

import sii.ma.training.Provider.ParametersProvider;

public class Triangle {

	private int height;
	private int base;
	
	

	Triangle(final String HeightAndBase) {
		final ParametersProvider provider = new ParametersProvider(HeightAndBase);

		base = provider.retrieveFirstParameter();
		height = provider.retrieveSecondarameter();

	}

	String calculateArea() {
		
		if (triangleIsDegraded()) {
			return new Integer((base * base) / 2).toString() + "\n";
		} else {
			return new Integer((height * base) / 2).toString() + "\n";
		}
	}

	private Boolean triangleIsDegraded() {
		return height == 0;
	}
}
