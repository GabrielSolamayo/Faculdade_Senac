/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class cod_C {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite um nome: ");
        System.out.println(nome.substring(0, 4));
    }
}
