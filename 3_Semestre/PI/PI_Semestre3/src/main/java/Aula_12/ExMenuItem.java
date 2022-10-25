package Aula_12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class ExMenuItem extends JFrame implements ActionListener{
	
	JMenuBar menu;
	JMenu arquivo, editor;
	JMenuItem novo, salvar;
	
	public static void main(String[] args) {
		new ExMenuItem();
	}
	
	public ExMenuItem() {
		setTitle("Usando Menu");
		setSize(500, 300); 
		
		menu = new JMenuBar(); //Criando o Menu;
		setJMenuBar(menu);
		
		//Criando o conteudo do Menu;
		arquivo = new JMenu("Arquivo");
		editor = new JMenu("Editar");
		menu.add(arquivo);
		menu.add(editor);
		
		//Criando os items do conteudo do menu;
		novo = new JMenuItem("Novo");
		novo.addActionListener(this);
		salvar = new JMenuItem("Salvar");
		salvar.addActionListener(this);
		arquivo.add(novo);
		arquivo.add(salvar);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==novo) {
			JOptionPane.showMessageDialog(null, "Voce Clicou no Novo");
		}
	}
}
