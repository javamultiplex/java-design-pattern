package com.javamultiplex.creational.abstractfactory.example1;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	public String toString() {
		return "Computer [RAM=" + getRAM() + ", HDD=" + getHDD() + ", CPU="
				+ getCPU() + "]";
	}

}
