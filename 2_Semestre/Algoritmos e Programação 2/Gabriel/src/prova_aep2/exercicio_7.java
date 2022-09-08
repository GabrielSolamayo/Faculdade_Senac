/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_aep2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 * Crie um programa que permita ao usuário informar a quantidade de jogadores que deseja cadastrar
e em seguida, utilizando vetores, efetuar o cadastramento do nome do jogador e a sua idade
(também utilizando vetores).
a. Exemplo o usuário informa que deseja cadastrar três jogadores e digita seus nomes e idade
e em seguida é exibida a mensagem:
i. Nome = ROGÉRIO. Idade = 33.
ii. Nome = RONALDO.Idade = 32.
iii. Nome = ROBINHO. Idade = 25.
 * 
 */
public class exercicio_7 {
        public static void imprimir(int num, String nome[], int idade[]){
        System.out.println("----- Resultado Final -----");
        for (int i = 0; i < num; i++) {
            System.out.println("| Nome do "+(i+1)+"° Jogador(a): "+nome[i]+"  |");
            System.out.println("| Idade do jogador(a) "+nome[i]+": "+idade[i]+" |");
            System.out.println("-------------------------------------------");
        }
    }
    
    public static void cadastrar (int num, String nome[], int idade[]){
        for (int i = 0; i < num; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° Jogador(a): ");
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador(a) "+nome[i]+": "));
        }
    }
    
    public static void main(String[] args) {
        int val = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cadastros: "));
        String nome[] = new String [val];
        int idade[] = new int [val];
        cadastrar(val, nome, idade);
        imprimir(val, nome, idade);
        System.out.println("^w^");
    }
}
