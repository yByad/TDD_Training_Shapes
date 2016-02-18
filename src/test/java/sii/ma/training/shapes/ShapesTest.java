package sii.ma.training.shapes;

/* 
 * The Shapes class should use the Writer to print the area of the given shape using the dimensions
 * given in the parameters. Every time the Shapes.area method is invoked, it should add a new line.
 *
 * Please implement this class to have all tests in ShapesTest turn green.
 * Try doing that with the simplest, cleanest code you can craft.
 * 
 * Setup the classpath and make sure you can run the ShapesTest.
 * The ShapesTest results will be a main factor when evaluating the solution. 
 */
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import sii.ma.training.facade.Shapes;

public class ShapesTest {

    private StringWriter out;
    private Shapes shapes;

    @Before
    public void initWriter() {
	out = new StringWriter();
	shapes = new Shapes(out);
    }

    @Test
    public void square() throws IOException {
	shapes.area("SQUARE", "30");
	assertEquals("900\n", out.toString());
    }

    @Test
    public void rectangle() throws IOException {
	shapes.area("RECTANGLE", "50,20");
	assertEquals("1000\n", out.toString());
    }

    @Test
    public void triangle() throws IOException {
	shapes.area("TRIANGLE", "50,20");
	assertEquals("500\n", out.toString());
    }

    @Test
    public void squareAndTriangle() throws IOException {
	shapes.area("SQUARE", "30");
	shapes.area("TRIANGLE", "40,20");
	assertEquals("900\n400\n", out.toString());
    }

    @Test
    public void degradedTriangle() throws IOException {
	shapes.area("TRIANGLE", "20");
	assertEquals("200\n", out.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void degradedTriangleEmptyFirstArgument() {
	shapes.area("TRIANGLE", ",20");
	assertEquals("200\n", out.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongShape() {
	shapes.area("Something", "20");
	assertEquals("0\n", out.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectangleWithThreeArguments() throws IOException {
	shapes.area("RECTANGLE", "50,20,10");
	assertEquals("1000\n", out.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectangleWithNoArguments() throws IOException {
	shapes.area("RECTANGLE", "");
	assertEquals("1000\n", out.toString());
    }

}