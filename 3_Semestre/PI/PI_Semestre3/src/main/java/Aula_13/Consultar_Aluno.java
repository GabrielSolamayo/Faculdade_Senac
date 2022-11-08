package Aula_13;

import java.sql.*;

public class Consultar_Aluno {

	public static void main(String[] args) {
		
		Consultar_Aluno alunos = new Consultar_Aluno();
		alunos.consultarAlunos();
	}
	
	public void consultarAlunos() {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi_senac", "root", "");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT idAlunos, nome_aluno, telefone_aluno FROM alunos");
			while(rs.next()) {
				Aluno novo = new Aluno();
				novo.setId(rs.getInt("idAlunos"));
				novo.setNome(rs.getString("nome_aluno"));
				novo.setTelefone(rs.getString("telefone_aluno"));
				System.out.println(novo);
			}
			rs.close();
			st.close();
			cn.close();
		}catch(SQLException e) {
			System.out.println("Falha ao realizar a operação");
			e.getMessage();
		}
	}
}
