package Aula_14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Aula_13.Aluno;
import Aula_13.Cadastrar_Aluno;

import java.sql.*;

public class Formulario extends JFrame implements ActionListener{
	JButton btnGravar, btnCancelar, btnAlterar, btnExcluir, btnConsultar;
	JLabel nome,telefone;
	JTextField txtNome, txtTelefone;

	public static void main(String[] args) {
		new Formulario();
	}

	public Formulario() {
		setTitle("Cadastro de Alunos");
		setSize(450 , 350);
		getContentPane().setLayout(null);

		int x=10, y=10, w=100, h=35;
		nome = criarRotulo("Nome: ", 10, 10, 100, 35);
		txtNome = criarTexto(110, 10, 300, 35);

		telefone = criarRotulo("Telefone: ", 10, 60, 100, 35);
		txtTelefone = criarTexto(110, 60, 300, 35);

		//Criando Botões;
		btnGravar = criarBotao("Gravar", 60, 120, 130, 30, 'G');
		btnGravar.addActionListener(this);

		btnConsultar = criarBotao("Consultar", 240, 120, 130, 30, 'C');
		btnConsultar.addActionListener(this);
		
		btnAlterar = criarBotao("Alterar", 60, 170, 130, 30, 'A');
		btnAlterar.addActionListener(this);

		btnExcluir = criarBotao("Excluir", 240, 170, 130, 30, 'E');
		btnExcluir.addActionListener(this);
		
		btnCancelar = criarBotao("Cancelar", 150, 220, 130, 30, 'S');
		btnCancelar.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	//Metodo para criar botao;
	private JButton criarBotao(String texto, int x, int y, int w, int h, char c) {
		JButton b1 = new JButton(texto);
		b1.setBounds(x, y, w, h);
		b1.setFont(new Font("Helvetica", Font.BOLD, 18));
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setVerticalAlignment(SwingConstants.CENTER);
		b1.setMnemonic(c); 
		add(b1);
		return b1;
	}

	//Metodo para cirar Rotulos;
	private JLabel criarRotulo(String texto, int x, int y, int w, int h) {
		JLabel l1 = new JLabel(texto);
		l1.setBounds(x, y, w, h);
		l1.setFont(new Font("Helvetica", Font.BOLD, 20));
		add(l1);
		return l1;
	}

	//Metodo para criar Textos;
	private JTextField criarTexto(int x, int y, int w, int h) {
		JTextField t1 = new JTextField();
		t1.setBounds(x, y, w, h);
		t1.setFont(new Font("Helvetica", Font.BOLD, 18));        
		//t1.addActionListener(this);
		t1.setHorizontalAlignment(SwingConstants.LEFT);
		add(t1);
		return t1;
	}

	//Evento dos botoes;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnGravar){
			int resp=JOptionPane.showConfirmDialog(null, "Confirma a gravação?");
			if(resp == 0) {
				Aluno novo = new Aluno(txtNome.getText(), txtTelefone.getText());
				gravarDados(novo);
				limparCampos();
			}
		}else if(e.getSource() ==  btnCancelar){
			int resp = JOptionPane.showConfirmDialog(null,"Confirma o encerramento?");
			if(resp==0)
				System.exit(0);
		}else if(e.getSource() == btnAlterar) {
			int resp = JOptionPane.showConfirmDialog(null, "Confirma a alteração?");
			if(resp == 0) {
				int iD = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno que deseja modificar: "));
				Aluno novo = new Aluno(txtNome.getText(), txtTelefone.getText());
				alterarDados(novo, iD);
				limparCampos();
			}
		}
	}

	//Gravando os dados no BD pi_senac;
	public void gravarDados(Aluno novo) {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi_senac","root", "");

			PreparedStatement ps = cn.prepareStatement("INSERT INTO alunos(nome_aluno, telefone_aluno) VALUES (?, ?)");
			ps.setString(1, novo.getNome());
			ps.setString(2, novo.getTelefone());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, 
					"Aluno cadastrado com sucesso.");
			ps.close();
			cn.close();
			System.out.println("Conexão encerrada.");            
		} catch (SQLException e) {
			System.out.println(
					"Falha ao tentar gravar o Aluno.");
			e.printStackTrace();
		}
	}

	public void consultarDados() {
		
	}

	public void excluirDados() {
		
	}
	
	//Aleterando os dados do aluno referente ao ID;
	public void alterarDados(Aluno novo, int id) {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pi_senac","root", "");

			PreparedStatement ps = cn.prepareStatement("UPDATE alunos SET nome_aluno = ?, telefone_aluno = ? WHERE idAlunos = ?");
			ps.setString(1, novo.getNome());
			ps.setString(2, novo.getTelefone());
			ps.setInt(3, id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, 
					"Aluno alterado com sucesso com sucesso.");
			ps.close();
			cn.close();
			System.out.println("Conexão encerrada.");            
		} catch (SQLException e) {
			System.out.println("Falha ao tentar alterar o Aluno.");
			e.printStackTrace();
		}
	}
	
	//Limpando as caixas de textos;
	private void limparCampos() {
		txtTelefone.setText("");
		txtNome.setText("");			
	}
}
