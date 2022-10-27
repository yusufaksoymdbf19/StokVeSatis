package ch2;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("pound giriniz:");
		double pound = scanner.nextDouble();
		double kg = pound * 0.454;
		System.out.printf("%.3f pound = %.3f kg",pound,kg);
	}

}
