package Aula_12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ExercicioMenu_Professor extends JFrame implements ActionListener{
	JButton ok, cancelar;
	JTextField txtUsuario, txtRGF;
	JLabel usuario, rgf;

	public ExercicioMenu_Professor(){
		setTitle("Login");
		setSize(450 , 200);
		getContentPane().setLayout(null);


		int x=10, y=10, w=100, h=35;
		usuario = criarRotulo("Usuario: ", x, y, w, h);
		txtUsuario = criarTexto(x+w, y, w+=200, h);

		x=10; 
		y=40;//define a linha
		w=100;
		h=35;        
		rgf = criarRotulo("Senha: ", x, y, w, h);
		txtRGF = criarTexto(x+w, y, w+=200, h);

		ok = criarBotao("Ok", (20), 100, 100, 35, 'G');
		ok.addActionListener(this);

		cancelar = criarBotao("Cancelar", (200), 100, 130, 35, 'S');
		cancelar.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private JButton criarBotao(String texto, int x, int y, int w, int h, char c) {
        JButton b1 = new JButton(texto);
        b1.setBounds(x, y, w, h);
        b1.setFont(new Font("Helvetica", Font.BOLD, 18));
//        b1.setToolTipText("Botao b1");
        //b1.addActionListener(this);
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setMnemonic(c); 
        add(b1);
        return b1;
    }
    
    
    private JLabel criarRotulo(String texto, int x, int y, int w, int h) {
        JLabel l1 = new JLabel(texto);
        l1.setBounds(x, y, w, h);
        l1.setFont(new Font("Helvetica", Font.BOLD, 20));
        add(l1);
        return l1;
    }
    
    
    private JTextField criarTexto(int x, int y, int w, int h) {
        JTextField t1 = new JTextField();
        t1.setBounds(x, y, w, h);
        t1.setFont(new Font("Helvetica", Font.BOLD, 18));        
        t1.addActionListener(this);
        t1.setHorizontalAlignment(SwingConstants.LEFT);
        add(t1);
        return t1;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
        	JOptionPane.showMessageDialog(null, "Dados Gravados");
        	System.exit(0);
        }else if(e.getSource() ==  cancelar){
            int resp = JOptionPane.showConfirmDialog(null, 
                    "Confirma o encerramento?");
            if(resp==0)
                System.exit(0);
        }
    }
}
