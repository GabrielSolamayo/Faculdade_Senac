/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_4;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class testeCaixaDialogo {
    public static void main(String[] args) {
        String nome;
        float salario;
        int resp;
        nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario: "));
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome+"/n Salario: "+salario);
        resp = JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
        JOptionPane.showMessageDialog(null, "Sua resposta = "+resp);
        
    }
}
