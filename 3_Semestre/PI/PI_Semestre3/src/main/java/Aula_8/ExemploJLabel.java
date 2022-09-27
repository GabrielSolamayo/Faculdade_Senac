/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_8;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author gabriel.esmunoz
 */
public class ExemploJLabel extends JFrame{
    JLabel j11, j12;
    
    public ExemploJLabel(){
        Container c = getContentPane();
        setTitle("Primeira janela Swing"); //titulo da janela;
        setSize(600, 400); //tamanho da janela - width-largura, heigth-altura;
        getContentPane().setLayout(null); //anula o layout padrão;
        c.setBackground(new Color(125, 255, 255)); //cor do fundo da janela no padrã RGB;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //provoca o termino da execução (encerra o programa);
        setVisible(true);
        setLocationRelativeTo(null);  
        j11 = criarRotulo("Nome: ", 10, 10, 200, 30);
        j12 = criarRotulo("Endereço: ", 10, 40, 200, 30);
    }
    
    private JLabel criarRotulo(String texto, int x, int y, int w, int h){
        JLabel rotulo = new JLabel();
        rotulo.setText(texto);
        rotulo.setLocation(x,y);
        rotulo.setSize(w,h);
        rotulo.setBackground(new Color(255, 255, 255));
        rotulo.setForeground(new Color(0,0,0));
        rotulo.setFont(new Font("Courier new", Font.BOLD,20));
        rotulo.setToolTipText("rotulolabel Exemplo");
        rotulo.setHorizontalAlignment(SwingConstants.LEFT);
        rotulo.setVerticalAlignment(SwingConstants.TOP);
        add(rotulo);
        return rotulo;
    }
    
    public static void main(String[] args) {
        new ExemploJLabel();
    }
}
