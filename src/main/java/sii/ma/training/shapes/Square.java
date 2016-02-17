package sii.ma.training.shapes;

import sii.ma.training.Provider.ParametersProvider;

class Square {

	private int side;
	
	

	Square(final String sideString) {
		final ParametersProvider provider = new ParametersProvider(sideString);
		side = provider.retrieveFirstParameter();
	}



	String calculateArea() {
		
		return new Integer(side * side).toString() + "\n";

	}

}
