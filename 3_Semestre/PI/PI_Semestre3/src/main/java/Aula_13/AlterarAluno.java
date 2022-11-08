package Aula_13;

import java.sql.*;

import javax.swing.JOptionPane;

public class AlterarAluno {
	public static void main(String[] args) {
		Consultar_Aluno alunos = new Consultar_Aluno();
		alunos.consultarAlunos();

		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno a alterar: "));

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");

		String telefone = JOptionPane.showInputDialog("Digite o telefone do aluno: ");

		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi_senac","root","");
			PreparedStatement pstm = cn.prepareStatement("UPDATE alunos SET nome_aluno = ?, telefone_aluno = ? WHERE idAlunos = ?");
			pstm.setString(1, nome);
			pstm.setString(2, telefone);
			pstm.setInt(3, id);
			pstm.execute();
			System.out.println("\nAluno alterado com sucesso!\n\n");
			alunos.consultarAlunos();
		}catch (SQLException e) {
			System.out.println("Falha ao tentar alterar aluno.");
			e.printStackTrace();
		}
	}
}
