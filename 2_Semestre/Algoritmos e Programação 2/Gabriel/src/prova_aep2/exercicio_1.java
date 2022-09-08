/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova_aep2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 * 
 * Crie um programa que permita, através de um método, verificar e informar ao usuário se um
número por ele digitado (através de caixas de diálogo) é perfeito ou não. Sabendo que um número
é perfeito se a soma de seus fatores é igual a este número (6 = 3+2+1).
a. Ex: Usuário digita o número 6.
b. Recebe a mensagem: O número 6 é perfeito
 */
public class exercicio_1 {
    
    public static void verficar_numPerfeito(int num){
        int val = 0;
        for (int i = 1; i < num; i++) {
            if(num%i == 0){
                val += i;
            }
        }
        if(val == num){
            System.out.println("O numero "+num+" é perfeito");
        }else{
            System.out.println("O numero "+num+" não é perfeito");
        }
    }
    
    
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        verficar_numPerfeito(tamanho);
        System.out.println("^w^");
    }
    
}
