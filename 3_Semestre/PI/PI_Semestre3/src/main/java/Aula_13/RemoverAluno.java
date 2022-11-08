package Aula_13;

import java.sql.*;

import javax.swing.JOptionPane;

public class RemoverAluno {
	public static void main(String[] args) {
		RemoverAluno novo = new RemoverAluno();
		try {
			novo.apagarRegistro();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void apagarRegistro() throws Exception{
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno para apagar: "));
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi_senac","root","");
			pstm = cn.prepareStatement("DELETE FROM alunos WHERE idAlunos = ?");
			pstm.setInt(1, id);
			pstm.execute();
		}catch(SQLException e) {
			cn.rollback();
			throw new Exception("Falha ao acessar a base de dados.", e);
		} finally {
			pstm.close();
			cn.close();
		}
	}
}
