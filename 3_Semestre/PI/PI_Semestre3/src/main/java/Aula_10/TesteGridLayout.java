/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_10;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author gabriel.esmunoz
 */
public class TesteGridLayout extends JFrame{
    public TesteGridLayout(){
        setTitle("Teste GrideLayout");
        setSize(300, 150);
        getContentPane().setBackground(new Color(139,0,0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout g1 = new GridLayout(3, 2, 5, 5);
        getContentPane().setLayout(g1);
        JButton b1 = new JButton("Linha 1 - Coluna 1");
        JButton b2 = new JButton("Linha 1 - Coluna 2");
        JButton b3 = new JButton("Linha 2 - Coluna 1");
        JButton b4 = new JButton("Linha 2 - Coluna 2");
        JButton b5 = new JButton("Linha 3 - Coluna 1");
        JButton b6 = new JButton("Linha 3 - Coluna 2");
        
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TesteGridLayout();
    }
}
