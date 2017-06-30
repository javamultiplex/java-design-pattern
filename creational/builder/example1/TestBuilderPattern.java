package com.javamultiplex.creational.builder.example1;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("500GB", "4GB").setGraphicsCardEnabled(true).build();
		System.out.println(computer);
	}

}
