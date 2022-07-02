package com.VeriTabaniIslem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
public class VeriTabaniIslemleri {
	static Connection connection=null;
	public static Connection Baglan(){
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost/projemdb", "root", "");
			return connection;
		}catch(Exception exception){
			System.out.println(exception.getMessage().toString());
			return null;
		}
	}
	public static String md5Sifrele(String stringSifre){
		try{
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] sifrelenmis = messageDigest.digest(stringSifre.getBytes());
			BigInteger bigInteger = new BigInteger(1,sifrelenmis);
			String hashIcerik = bigInteger.toString(16);
			while(hashIcerik.length()<32){
				hashIcerik = "0" + hashIcerik;
			}
			return hashIcerik;
		}catch(NoSuchAlgorithmException noSuchAlgorithmException){
			System.out.println(noSuchAlgorithmException.getMessage().toString());
			throw new RuntimeException(noSuchAlgorithmException);
		}
	}
		
			 
	

}
