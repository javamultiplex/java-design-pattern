package com.javamultiplex.behavioral.template.example2;

public class TestTemplateMethodPattern {

	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		System.out.println("***********************");
		Game football = new Football();
		football.play();
	}

}
