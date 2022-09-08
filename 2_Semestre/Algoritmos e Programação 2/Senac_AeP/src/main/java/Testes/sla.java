/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;


import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel.esmunoz
 */
public class sla {
    public static void main(String[] args) {
        String outro = "Pato";
        String nome = JOptionPane.showInputDialog("Digite um nome: ");
//        System.out.println(outro);
//        System.out.println(nome);
        if(nome.equalsIgnoreCase(outro)){
            JOptionPane.showInputDialog("iguais");
        }else{
            JOptionPane.showInputDialog("diferente");

        }
    }
}
