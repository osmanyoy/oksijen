package com.yapikredi.project.customer.business;

import java.util.Scanner;

public class UserInterractions {
	private static volatile UserInterractions instance;

	private UserInterractions() {
		scanner = new Scanner(System.in);
	}

	public static UserInterractions getInstance() {
		if (instance == null) {
			synchronized (UserInterractions.class) {
				if (instance == null) {
					instance = new UserInterractions();
				}
			}
		}
		return instance;
	}
	
	private final Scanner scanner;
	
	public String getStringInput() {
		String nextLine = scanner.nextLine();
		return nextLine;
	}
	
	public void printLine(String str) {
		System.out.println(str);
	}

	public int getIntegerInput() {
		return scanner.nextInt();
	}
	
}
