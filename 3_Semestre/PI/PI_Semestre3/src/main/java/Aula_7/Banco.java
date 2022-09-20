/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class Banco {
    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
        
        ClienteBanco clienteBanco[] = new ClienteBanco[qtd];
        
        for (int i = 0; i < qtd; i++) {
            clienteBanco[i] = new ClienteBanco();
            clienteBanco[i].setNome(JOptionPane.showInputDialog("Digite o Nome: "));
            clienteBanco[i].setCPF(JOptionPane.showInputDialog("Digite o CPF: "));
            clienteBanco[i].setEndereco(JOptionPane.showInputDialog("Digite o Endereco: "));
        }
        
        for (int i = 0; i < qtd; i++) {
            System.out.println(clienteBanco[i]);
        }
    }
}
