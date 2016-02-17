package sii.ma.training.shapes;

public class Triangle {

	private int height;
	private int base;

	String calculateArea(final String HeightAndBase) {
		final ParametersProvider provider = new ParametersProvider(HeightAndBase);

		base = provider.retrieveFirstParameter();
		height = provider.retrieveSecondarameter();

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
