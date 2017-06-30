package com.javamultiplex.creational.factory.example2;

public class TestFactoryPattern {

	public static void main(String[] args) {

		Shape circle = ShapeFactory.getShape("circle");
		circle.draw();
		Shape square = ShapeFactory.getShape("square");
		square.draw();
		Shape rectangle = ShapeFactory.getShape("rectangle");
		rectangle.draw();

	}

}
