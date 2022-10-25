package Aula_12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ExJTextArea extends JFrame implements ActionListener{
	
	JTextField texto;
	JTextArea area1, area2;
	JButton b1, b2;
	
	public static void main(String[] args) {
		new ExJTextArea();
	}
	
	public ExJTextArea() {
		setTitle("Usando Áreas de Texto"); //Titulo da janela;
        setSize(500, 300); //Tamanho da janela;
        setLayout(new GridLayout(5, 1)); //Definindo a janela em 5 Linhas e 1 Coluna;
        
        texto = new JTextField();
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("Arial", Font.PLAIN, 20));
        texto.setForeground(new Color(26, 72, 17));
        texto.addActionListener(this);
        setLayout(new GridLayout(6, 1, 3, 3));
        
        JPanel p1 = new JPanel(); //Criando um painel para os botões;
        p1.setLayout(new GridLayout(1, 2)); //Definindo para 1 Linha e 2 Colunas;
        
        
		area1 = new JTextArea("Editor de Texto",3 , 80); //Instanciando e definindo 3 Linhas e 80 Colunas;
		area1.setBackground(new Color(238,238,198)); //Cor de fundo;
		
		area2 = new JTextArea(3 , 80); //Instanciando e definindo 3 Linhas e 80 Colunas;
		area2.setBackground(new Color(155,238,245)); //Cord de fundo;
		
		//Crando Botões;
		b1 = criarBotao("Copiar Tudo" , 'T');
		b2 = criarBotao("Copiar Seleção" , 'S');
		
		//Adcionando botões/s
		p1.add(b1);
		p1.add(b2);
		
		//Adcicionando o resto;
		add(area1);
		add(texto);  	
		add(p1);
		add(area2); 
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			area2.setText(area1.getText()); //Area 2 recebe tudo do Area 1;
		}
		else if(e.getSource()==b2) {
			area2.setText(area1.getSelectedText()); //Area 2 recebe so o selecionado da Area 1;
		}
		else if(e.getSource()==texto) {
			area1.setText(texto.getText()); //Area 1 recebe o conteudo da caixa de Texto;
		}	
	}
	
	private JButton criarBotao(String texto, char c) {
		JButton botao = new JButton(texto);
		botao.setMnemonic(c);
		botao.addActionListener(this);
		add(botao);
		return botao;	
	}
}
