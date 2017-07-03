package com.javamultiplex.behavioral.template.example1;

public class TestTemplateMethodPattern {
	public static void main(String[] args) {

		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		System.out.println("*****************************");
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();

	}
}
