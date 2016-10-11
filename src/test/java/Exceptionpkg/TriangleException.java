package Exceptionpkg;

import TrianglePackage.Triangle;

public class TriangleException extends Exception {

	Triangle triangle = new Triangle();
	
	public TriangleException(String message) {
		super(message);
	}

	
}
