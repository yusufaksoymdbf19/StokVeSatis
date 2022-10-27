package ch2;
import java.util.Scanner;
/**
 * Chapter 2 Exercise 3:
 *
 *      (Convert feet into meters) Write a program that reads a number in feet,
 *      converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 * Created by Luiz Arantes Sa on 8/23/14.
 */
public class Soru3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.print("feet giriniz:");
		double feet = scanner.nextDouble();
		double metre = feet * 0.305;
		System.out.printf("feet: %.3f metre:  %.3f",feet,metre);
		scanner.close();
	}
	
	
}
