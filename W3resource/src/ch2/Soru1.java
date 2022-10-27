package ch2;
import java.util.Scanner;
public class Soru1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Celcius giriniz:");
		double celcius = input.nextDouble();
		double fahrenheit = (9/5) * celcius + 32;
		System.out.printf("%.3f celcius = %.3f fahrenheit...",celcius, fahrenheit);
		
		
	}
}
