package com.ak.Connection;

public class OracleConnection implements IConnection {

	@Override
	public void connect() {
		System.out.println("Connected to Oracle DB");
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnected from Oracle DB");
	}

	
}
