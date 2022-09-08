/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_aep2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 * 
 * Crie um programa que permita, através de um método, verificar e informar ao usuário o fatorial de
um número por ele digitado(através de caixas de diálogo). Sabendo que o fatorial de um número é
igual a multiplicação de todos os inteiros de 1 até este número (3! = 3*2*1➔ 6).
a. Ex: Usuário digita o número 3.
b. Recebe a mensagem: O fatorial de 3 é = 6.
 * 
 * 
 */

public class exercicio_2 {
    
    public static void imprimirmens(int num , int resul){
        System.out.println("Fatorial");
        System.out.print("3!: ");
        for (int i = 1; i <= num; i++) {
            if(i == 3){
                System.out.println(i+" = "+ resul);
            }else{
            System.out.print(i+"*");
            }
        }
    }
    
    public static int fatorial(int num){
        int val = 0;
        for (int i = 1; i <= num; i++) {
            if(i == 1){
                val = i;
            }else{
                val = val * i;
            }
        }
        return val;
    }
    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int resul = fatorial(num);
        imprimirmens(num, resul);
        System.out.println("^w^");
    }
}
