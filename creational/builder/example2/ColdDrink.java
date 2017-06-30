package com.javamultiplex.creational.builder.example2;

public abstract class ColdDrink implements Item {

	@Override
	public Packing pack() {
		return new Bottle();
	}

}
