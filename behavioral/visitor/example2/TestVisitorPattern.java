package com.javamultiplex.behavioral.visitor.example2;

public class TestVisitorPattern {

	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartVisitorImpl());

	}

}
