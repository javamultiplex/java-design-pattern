package com.javamultiplex.structural.proxy.example2;

public class TestProxyPattern {
	public static void main(String[] args) {

		OfficeInternetAccess access = new ProxyInternetAccess("Rohit");
		access.grantInternetAccess();
	}

}
