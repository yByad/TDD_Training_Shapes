package sii.ma.training.facade;

import java.io.StringWriter;

import sii.ma.training.area.Formatter;

public class OutFormatter implements Formatter {
    private StringWriter out;

    public OutFormatter(StringWriter out) {
	super();
	this.out = out;
    }

    @Override
    public void write(int area) {

	out.write(area + "\n");
    }
}
