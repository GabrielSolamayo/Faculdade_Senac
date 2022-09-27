/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_8;

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel.esmunoz
 */
public class Janela1 extends JFrame{
    
    public Janela1(){
        Container c = getContentPane();
        setTitle("Primeira janela Swing"); //titulo da janela;
        setSize(900, 500); //tamanho da janela - width-largura, heigth-altura;
        getContentPane().setLayout(null); //anula o layout padrão;
        c.setBackground(new Color(125, 255, 255)); //cor do fundo da janela no padrã RGB;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //provoca o termino da execução (encerra o programa);
        setVisible(true);
        //setLocationRelativeTo(true);
        centralizar();
        
    }
    
    
    public static void main(String[] args) {
        new Janela1();
    }
    
    public void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //obtem a altura e largura da resolução video;
        Dimension janela = getSize(); //obtem a altura e largura da minha janela;
        if(janela.height > screen.height){
            setSize(janela.width, screen.height);
        }
        if(janela.width > screen.width){
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width)/2,(screen.height - janela.height)/2);
    }
}
