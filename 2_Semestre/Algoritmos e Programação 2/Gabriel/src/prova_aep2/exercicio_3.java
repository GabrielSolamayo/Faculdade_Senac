/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_aep2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 * Crie um programa que permita, através de um método, verificar e informar ao usuário o resultado
de uma base elevado a uma potência, valores por ele digitado(através de caixas de diálogo).
Sabendo que a potência de um número é igual a multiplicação de sua base pela quantidade de
vezes indicada em seu expoente (23 = 2*2*2➔ 8). Não use a classe Math>
a. Ex: Usuário digita como base o número 2 e como expoente o número 3.
b. Recebe a mensagem: 2 elevado a potência 3 = 8.
 * 
 */
public class exercicio_3 {
    
    public static int elevar(int base, int potencia){
        int resul = 0;
        for (int i = 0; i < potencia; i++) {
            if(i == 0){
                resul = base;
            }else{
                resul = resul * base;
            }
        }
        return resul;
    }
    
    public static void imprimirmens(int base , int potencia, int resul){
        System.out.print(base+"^"+potencia+": ");
        for (int i = 1; i <= potencia; i++) {
            if(i == potencia){
                System.out.print("2 = "+resul);
            }else{
                System.out.print("2*");
            }
        }
    }
    
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        int potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite potencial para a base: "));
        int resul = elevar(base, potencia);
        imprimirmens(base, potencia, resul);
        System.out.println("^w^");
    }
}
