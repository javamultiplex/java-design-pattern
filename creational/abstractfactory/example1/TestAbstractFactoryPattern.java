package com.javamultiplex.creational.abstractfactory.example1;

public class TestAbstractFactoryPattern {

	public static void main(String[] args) {

		ComputerAbstractFactory pcFactory = new PCFactory("4GB", "500GB",
				"2.3GHZ");
		ComputerAbstractFactory serverFactory = new ServerFactory("10GB",
				"1TB", "10GHZ");
		Computer pc = ComputerFactory.getComputer(pcFactory);
		Computer server = ComputerFactory.getComputer(serverFactory);

		System.out.println("PC : " + pc);
		System.out.println("Server : " + server);
	}

}
