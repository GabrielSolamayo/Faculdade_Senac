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
public class Janela2_Usuario extends JFrame{
    public Janela2_Usuario(){
        Container c = getContentPane();
        setTitle(JOptionPane.showInputDialog("Digite o Titulo da Janela: ")); //titulo da janela;
        setSize(Integer.parseInt(JOptionPane.showInputDialog("Digite a largura (pixel): ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite a altura (pixel): "))); //tamanho da janela - width-largura, heigth-altura;
        getContentPane().setLayout(null); //anula o layout padrão;
        c.setBackground(new Color(Integer.parseInt(JOptionPane.showInputDialog("Red (RGB): ")),
                                  Integer.parseInt(JOptionPane.showInputDialog("Green (RGB): ")),
                                  Integer.parseInt(JOptionPane.showInputDialog("Blue (RGB): ")))); //cor do fundo da janela no padrão RGB;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //provoca o termino da execução (encerra o programa);
        setVisible(true);
        setLocationRelativeTo(null);
        //centralizar();
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
    
     public static void main(String[] args) {
        new Janela2_Usuario();
    }
}
