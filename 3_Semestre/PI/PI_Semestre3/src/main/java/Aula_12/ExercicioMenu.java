package Aula_12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import Aula_10.Exercicio_1;



public class ExercicioMenu extends JFrame implements ActionListener{
	
	JMenuBar menu;
	JMenu cadastro, alteracao, exclusao, encerrar;
	JMenuItem professor, aluno, funcionario, todos, pRGF, pRA, pCPF, sair;
	
	public static void main(String[] args) {
		new ExercicioMenu();
	}
	
	public ExercicioMenu() {
		setTitle("Senac");
		setSize(500, 300); 
		
		menu = new JMenuBar(); //Criando o Menu;
		setJMenuBar(menu);
		
		//Criando o conteudo do Menu;
		cadastro = new JMenu("Cadastro");
		alteracao = new JMenu("Alteracão");
		exclusao = new JMenu("Exclusão");
		encerrar = new JMenu("Encerrar");
		menu.add(cadastro);
		menu.add(alteracao);
		menu.add(exclusao);
		menu.add(encerrar);
		
		//Criando os items de Cadastro;
		professor = new JMenuItem("Professor");
		professor.addActionListener(this);
		aluno = new JMenuItem("Aluno");
		funcionario = new JMenuItem("Funcionario");
		cadastro.add(professor);
		cadastro.add(aluno);
		cadastro.add(funcionario);
		
		//Criando os itens de Alteracao;
		todos = new JMenuItem("Todos");
		alteracao.add(todos);
		
		//Criando os itens de Exclusao;
		pRGF = new JMenuItem("Por RGF");
		pRA = new JMenuItem("Por RA");
		pCPF = new JMenuItem("Por CPF");
		exclusao.add(pRGF);
		exclusao.add(pRA);
		exclusao.add(pCPF);
		
		//Criando os itens de Encerrar;
		sair = new JMenuItem("Sair");
		encerrar.add(sair);
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==professor) {
			new ExercicioMenu_Professor();
		}
	}
}
