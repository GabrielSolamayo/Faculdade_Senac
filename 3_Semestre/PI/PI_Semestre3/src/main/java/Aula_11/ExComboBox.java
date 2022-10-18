/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author gabriel.esmunoz
 */
public class ExComboBox extends JFrame implements ActionListener, ItemListener{
    
    JLabel l1;
    JTextField t1, t2, t3;
    JComboBox combo;
    JButton b1, b2, b3, b4, b5, b6; //Instanciações
    
    public ExComboBox (){
        setTitle("Uso do JComboBox");
        setSize(400, 170);
        getContentPane().setBackground(new Color(190, 190, 190));
        l1 = new JLabel("Conteudo");
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        t2.setHorizontalAlignment(SwingConstants.CENTER);
        String cores[] = {"Branco", "Vermelho","Azul", "Verde"};
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
}
