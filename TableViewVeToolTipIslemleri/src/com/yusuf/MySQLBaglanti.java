//mysql baglantý kurma nasýl yapýlýr 1
package com.yusuf;
import java.sql.Connection;
import java.security.MessageDigest;
import java.sql.DriverManager;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
public class MySQLBaglanti {
	static Connection connection = null;

	public static Connection Baglanti(){
		try{
		//jdbc:mysql://ServerIPAdresi/veritabanýismi,"kullanýcýadý","sifre" //benim sifre: ""
		connection = DriverManager.getConnection("jdbc:mysql://localhost/projemdb","root","");
		return connection;
		}catch(Exception exception){
			System.out.println(exception.getMessage().toString());
			return null;
		}
	}
	//md5 sifrelemesi nasýl yapýlýr?
	//byte olarak oku,
	//hex hesapla... sekliyle...
	public static String md5Sifrele(String sifre){
		try{
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			//byte olarak oku
			byte[] sifrelenmis= messageDigest.digest(sifre.getBytes());
			BigInteger bigInteger = new BigInteger(1,sifrelenmis);
			//Hex hesapla...
			String hashIcerik = bigInteger.toString(16);
			while(hashIcerik.length()<32){
				hashIcerik = "0" + hashIcerik;
			}
			return hashIcerik;
		}catch(NoSuchAlgorithmException noSuchAlgorithmException){
			throw new RuntimeException(noSuchAlgorithmException);
			
		}
	}
			
			
			
			
			
			
	
	

}
