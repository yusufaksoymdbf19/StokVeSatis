package tr.com.yusuf.core;
import tr.com.yusuf.interfaces.CoreInterfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ObjectHelper extends CoreFields implements CoreInterfaces{
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	@Override
	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
