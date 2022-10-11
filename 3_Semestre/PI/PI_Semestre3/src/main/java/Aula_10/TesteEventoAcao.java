/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_10;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author gabriel.esmunoz
 */
public class TesteEventoAcao extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1, b2;
    int i1 = 0, i2 = 0;

    public TesteEventoAcao() {
        setTitle("Teste evento acao");
        setSize(350, 150);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(122, 120, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        b1 = new JButton("Gravar");
        b1.setBounds(10, 10, 100, 30);
        b1.addActionListener(this);
        b2 = new JButton("Sair");
        b2.setBounds(120, 10, 100, 30);
        b2.addActionListener(this);
        l1 = new JLabel("Pressione os botoes");
        l1.setBounds(5, 50, 220, 20);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(l1);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setText("Botao gravar pressionado " + ++i1 + " vez(es)");
        }
        if (e.getSource() == b2) {
            l1.setText("Botao sair pressionado " + ++i2 + " vez(es)");
        }
    }

    public static void main(String[] args) {
        new TesteEventoAcao();
    }
}
