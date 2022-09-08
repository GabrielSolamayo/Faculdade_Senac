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
 * Crie um programa que permita ao usuário informar a quantidade de clientes que deseja cadastrar e
em seguida, utilizando vetores, efetuar o cadastramento do nome do cliente e o valor total da sua
compra (também utilizando vetores).
a. Exemplo o usuário informa que deseja cadastrar três clientes e digita seus nomes e o valor
total de suas compras em seguida é exibida a mensagem:
i. Nome = JOÃO. Total de compras = 138.55.
ii. Nome = MARCELA.Total de compras = 38.55.
iii. Nome = MARIA. Total de compras = 77.55.
 */
public class exercicio_6 {
public static void imprimir(int num, String nome[], float valores[]){
        System.out.println("----- Resultado Final -----");
        for (int i = 0; i < num; i++) {
            System.out.println("| Nome do "+(i+1)+"° Cliente: "+nome[i]+"                       |");
            System.out.println("| Valor TOTAL da(s) compra(s)  de "+nome[i]+": R$"+valores[i]+" |");
            System.out.println("-------------------------------------------");
        }
    }
    
    public static void cadastrar (int num, String nome[], float valores[]){
        for (int i = 0; i < num; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° cliente: ");
            valores[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da(s) compra(s) de "+nome[i]+": "));
        }
    }
    
    public static void main(String[] args) {
        int val = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cadastros para clientes: "));
        String nome[] = new String [val];
        float valores[] = new float [val];
        cadastrar(val, nome, valores);
        imprimir(val, nome, valores);
        System.out.println("^w^");
    }
}
