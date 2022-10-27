package ch1;
/**
 * Chapter 1 Exercise 8:
 *      (Area and perimeter of a circle) Write a program that displays the area and perimeter
 *      of a circle that has a radius of 5.5
 *
 * 
 */
public class Soru8 {
	public static void main(String[] args) {
		double r = 5.5;
		System.out.println("Alan:"+Math.PI*Math.pow(r, 2));
		System.out.println("Cevre:"+2*Math.PI*r);
		
	}
}
