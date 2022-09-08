/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_aep2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 * Crie um programa que permita receber do usuário e exibir posteriormente os múltiplos de 3(três)
do número 1(um) até o número digitado pelo usuário.
a. Exemplo o usuário digita 10 e são exibidos 3 , 6 , 9 (tudo através de caixas de diálogo
adequadas).
 * 
 */
public class exercicio_4 {
    
    public static void multiplos_3(int val){
        int num = 3;
        while(num < val){
            if((num + 3) > val || (num + 3) ==  val){
                System.out.println(num+"");
            }else{
                System.out.print(num+", ");
            }
            num += 3;
        }
    }
    
    public static void main(String[] args) {
        int val = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        System.out.println("Número múltiplos por 3 (até "+val+"):");
        multiplos_3(val);
        System.out.println("^w^");
    }
}
