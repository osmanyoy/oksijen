package com.yapikredi.dp.oo;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giriþ : ");
		String nextLine = scanner.nextLine();
		System.out.println("Int Giriþ : ");
		int nextInt = scanner.nextInt();
		System.out.println("NextLine : " + nextLine + " int : " + nextInt);
	}
}
