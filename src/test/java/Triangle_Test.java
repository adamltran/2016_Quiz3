import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Exceptionpkg.TriangleException;
import TrianglePackage.Triangle;

public class Triangle_Test {

	public Triangle_Test() {
	}

	private Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle(2, 2, 100);
	}
		
	@Test //must test getArea()
	public void getAreaTest() throws TriangleException {
		Triangle triangle = new Triangle(3, 4, 5);
		double answer = triangle.getArea();
		double actual = 6;
		assertEquals(answer, actual, .01);
		
		triangle.getSide1();
		triangle.getSide2();
		triangle.getSide3();
		triangle.toString();
	}
	@Test //must test getPerimeter()
	public void getPerimeterTest() throws TriangleException {
		Triangle triangle = new Triangle(3, 4, 5);
		double answer = triangle.getPerimeter();
		double actual = 12;
		assertEquals(answer, actual, .01);
		
	}
	
	@Test(expected = TriangleException.class) //TriangleException Area test
	public void testTriangleException() {
		triangle.getArea();
		
	}
	
	
	
	
	
	
	
	
	
}
