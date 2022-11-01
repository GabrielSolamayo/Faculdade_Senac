package Aula_13;

import java.sql.*;

import javax.swing.JOptionPane;

public class ExemploPreparedStatement {

	public static void main(String[] args) {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi_senac", "root", "");
			
			PreparedStatement ps = cn.prepareStatement("INSERT INTO alunos (nome_aluno, telefone_aluno) VALUES(?, ?)");
			ps.setString(1, JOptionPane.showInputDialog("Digite o nome para cadastro: "));
			ps.setString(2, JOptionPane.showInputDialog("Digite o telefone para cadastro: "));
			ps.execute();
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			ps.close();
			cn.close();
			System.out.println("Conexão encerrada.");
		}catch (SQLException e) {
			System.out.println("Falha ao tentar gravar o aluno.");
			e.printStackTrace();
		}
	}
}
