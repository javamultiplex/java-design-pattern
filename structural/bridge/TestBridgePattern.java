package com.javamultiplex.structural.bridge;

public class TestBridgePattern {

	public static void main(String[] args) {

		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		Shape rectangle = new Rectangle(new GreenColor());
		rectangle.applyColor();
	}

}
