package com.javamultiplex.behavioral.visitor.example2;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
