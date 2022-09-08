/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_aep2;

/**
 *
 * @author gabriel.esmunoz
 * Qual a diferença entre as estruturas de controle while e do - while? Crie um exercício que
exemplifique a utilização de ambos.
 * 
 */
public class exercicio_8 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        System.out.println("Resultado do 'While':");
        System.out.println    ("---------------\n");
        while(num1 != num2){
            System.out.println("Codigo Efetuado");
        }
        System.out.println    ("---------------\n");
        System.out.println("Resultado do 'Do While':");
        System.out.println    ("---------------");
        do{
            System.out.println("Codigo Efetuado");
        } while(num1 != num2);
        System.out.println    ("---------------");
        System.out.println("^w^");
    }
}
