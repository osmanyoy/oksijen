package com.yapikredi.dp.oo;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giri� : ");
		String nextLine = scanner.nextLine();
		System.out.println("Int Giri� : ");
		int nextInt = scanner.nextInt();
		System.out.println("NextLine : " + nextLine + " int : " + nextInt);
	}
}
