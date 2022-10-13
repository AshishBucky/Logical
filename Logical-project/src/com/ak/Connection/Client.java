package com.ak.Connection;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which DataBase you want to connect ?");
		String className=sc.next();
		Class cls=Class.forName(className);
		//Object obj1=(OracleConnection)cls.newInstance();
		//OracleConnection obj2=(OracleConnection) cls.newInstance();
		IConnection obj3=(IConnection) cls.newInstance();
		obj3.connect();
		obj3.disConnect();
		
		
	}

}
