package ch1;
/**
* Chapter 1 Exercise 4:
*      (Print a table) Write a program that displays the following table:
*
*      a   a^2 a^3
*      1   1   1
*      ....
*      4   16  64
*
* Created by Luiz Arantes Sa on 8/23/14.
*/
public class Soru4 {
	public static void main(String[] args) {
		System.out.println("  a    a^2   a^3");
		for(int i=1;i<5;i++) {
			System.out.printf("%3d %5d %5d%n",i,i*i,i*i*i);
		}
		
	}
}
