package com.ak.Connection;

public class SqlServer implements IConnection {

	@Override
	public void connect() {
		System.out.println("Connected to SqlServer DB");
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnected from SqlServer DB");
	}

}
