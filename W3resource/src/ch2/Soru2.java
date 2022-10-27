package ch2;
import java.util.Scanner;
/**
 * Chapter 2 Exercise 2:
 *
 *      (Compute the volume of a cylinder) Write a program that reads in the radius
 *      and length of a cylinder and computes the area and volume.
 *
 * Created by Luiz Arantes Sa on 8/23/14.
 */
public class Soru2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("yaricap giriniz:");
		double yariCap = scanner.nextDouble();
		System.out.print("uzunluk giriniz:");
		double uzunluk = scanner.nextDouble();
		double alan = Math.PI * Math.pow(yariCap,2);
		double hacim = alan * uzunluk;
		System.out.printf("Alan: %.3f, Hacim: %.3f",alan,hacim);
		
		
		
	}
}
