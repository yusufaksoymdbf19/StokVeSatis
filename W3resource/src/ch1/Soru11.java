/**
 * Chapter 1 Exercise 11:
 *      (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 *
 * Created by Luiz Arantes Sa on 8/23/14.
 */package ch1;

public class Soru11 {
public static void main(String[] args) {
	double birthRateSecond=7.0;
	double deathRateSecond=13.0;
	double immigrantRateSecond=45;
	double simdikiNufus = 312032486;
	double secondInYears=365.0*24.0*60.0*60.0;
	double dogumSayisi=secondInYears/birthRateSecond;
	double olumOraniSayisi = secondInYears/deathRateSecond;
	double multeciSayisi = secondInYears/immigrantRateSecond;
	for(int i=0;i<5;i++) {
		simdikiNufus+=(dogumSayisi+olumOraniSayisi+multeciSayisi);
		System.out.println("yil "+i+"= "+simdikiNufus);
	}
	
}
}
