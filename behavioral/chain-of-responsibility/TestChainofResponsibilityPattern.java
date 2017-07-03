package com.javamultiplex.behavioral.chainofresponsibility;

import java.util.Scanner;

public class TestChainofResponsibilityPattern {

	DispenseChain c1;

	public TestChainofResponsibilityPattern() {

		c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();
		c1.setNextChain(c2);
		c2.setNextChain(c3);

	}

	public static void main(String[] args) {

		TestChainofResponsibilityPattern pattern = new TestChainofResponsibilityPattern();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount = input.nextInt();
		input.close();
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10.");
		} else {
			pattern.c1.dispense(new Currency(amount));
		}

	}

}
