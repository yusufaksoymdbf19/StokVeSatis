package ch1;
/**
 * Chapter 1 Exercise 10:
 *
 *      (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 *       Write a program that displays the average speed in miles per hour.
 *      (Note that 1 mile is 1.6 kilometers.)
 *
 * Created by Luiz Arantes Sa on 8/23/14.
 */
public class Soru10 {
	public static void main(String[] args) {
		double mil = 14.0/1.6;
		double saat = (45.5*60.0+30.0)/(60.0*60.0);
		System.out.println(mil/saat);
	}
}
