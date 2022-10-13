package com.ak.Connection;

public class MySqlConnection implements IConnection {

	@Override
	public void connect() {
		System.out.println("Connected to MySql DB");
	}

	@Override
	public void disConnect() {
		System.out.println("Disconnected to MySql");
	}

}
