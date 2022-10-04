/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author gabriel.esmunoz
 */
public class TesteFlowLayout extends JFrame{
    
    public TesteFlowLayout(){
        setTitle("Teste FlowLayout");
        setSize(300, 120);
        getContentPane().setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Cria um flowlayout alinhando seus componentes ah esquerda
        //e definindo o espaçamento horizontal e vertical entre eles;
        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT, 10, 10);
        getContentPane().setLayout(f1);
        JButton b1 = new JButton("Botão 1");
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");
        JButton b4 = new JButton("Botão 4");
        JButton b5 = new JButton("Botão 5");
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TesteFlowLayout();
    }
}
