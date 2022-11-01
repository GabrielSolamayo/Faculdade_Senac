package Aula_13;

import java.sql.*;

public class ConnectaMySQL {
	private final static String url = "jdbc:mysql://localhost:3306/pi_senac";

	private final static String username = "root";
	private final static String password = "";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private String nome = null;
	private String telefone = null;

	public static void main(String[] args) {
		ConnectaMySQL b = new ConnectaMySQL();
		b.openDB();
		b.closeDB();
	}
	
	public void openDB() {
		try {
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso!\n");
		}catch(SQLException e){
			System.out.println("\nNão foi possível estabelecer conexão "+ e +"\n");
			System.exit(1);
		}
	}
	
	public void closeDB() {
		try {
			con.close();
		}catch(SQLException e) {
			System.out.println("\nNão foi possível estabelecer conexão "+ e + "\n");
			System.exit(1);
		}
	}

}
