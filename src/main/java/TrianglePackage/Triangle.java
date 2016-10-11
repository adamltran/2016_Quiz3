package TrianglePackage;

import java.util.*;
import Exceptionpkg.TriangleException;;
public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0; // Sides
	private double side3 = 1.0;

	//Attributes converted into strings
	private String sideOne = String.valueOf(getSide1());
	private String sideTwo = String.valueOf(getSide2());
	private String sideThree = String.valueOf(getSide3());; 
	private String perimeter = String.valueOf(getPerimeter());
	private String area = String.valueOf(getArea());

	//No arg constructor for triangle
	public Triangle() {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	//Triangle Constructor With Specified Sides
	public Triangle(double side1, double side2, double side3) throws TriangleException { 
		this(); 
		Triangle turnt = new Triangle();
		
		if ((turnt.getArea() == 0) || ((side1 < 0) || (side2 < 0) || (side3 < 0))) {
			throw new TriangleException("Invalid values for side(s).");
		}
		else {
			                                                
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			
		}
	}

	//Getter For Side1
	public double getSide1() {
		return side1;
	}

	//Getter for Side2
	public double getSide2() {          
		return side2;
	}

	//Getter for Side3
	public double getSide3() {
		return side3;
	}

	
	
	
	//getArea() Implementation
	@Override
	public double getArea() {
		double s = ((side1 + side2 + side3) / 2); 
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	}
    
	//getPerimeter() Implementation
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	
	
	//toString() Implementation
	public String toString() {
		return "Side1: " + " " + sideOne + " " + "Side2: " + " " + sideTwo + " " + "Side3: " + " " + sideThree + " "
				+ "Perimeter: " + " " + perimeter + " " + "Area: " + " " + area;
	}
	
}
