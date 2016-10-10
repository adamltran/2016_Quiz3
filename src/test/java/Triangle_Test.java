import static org.junit.Assert.*;

import org.junit.Test;
import TrianglePackage.Triangle;

public class Triangle_Test {

	public Triangle_Test() {
	}

	@Test //must test getArea()
	public void getAreaTest() {
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
	public void getPerimeterTest() {
		Triangle triangle = new Triangle(3, 4, 5);
		double answer = triangle.getPerimeter();
		double actual = 12;
		assertEquals(answer, actual, .01);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
