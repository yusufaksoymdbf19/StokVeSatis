package com.MySQL.Baglanti;
import java.sql.Connection;
import java.sql.DriverManager;
//java.sql is not accessible hatasý nasýl çözülür?
//module-info.java dosyasýnda requires java.sql; ekleyerek.
public class Baglanti {
	static Connection connection=null;
	public static Connection BaglantiKur(){
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost/projemdb", "root", "");
			return connection;
		}catch(Exception exception){
			System.out.println(exception.getMessage().toString());
			return null;
		}
	}
}
