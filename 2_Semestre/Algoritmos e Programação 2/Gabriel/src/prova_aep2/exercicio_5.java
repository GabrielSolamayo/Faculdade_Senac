/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_aep2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 * Crie um programa que permita ao usuário informar a quantidade de alunos que deseja cadastrar e
em seguida, utilizando vetores, efetuar o cadastramento do nome do aluno e sua nota na prova
AC1(também utilizando vetores).
a. Exemplo o usuário informa que deseja cadastrar dois alunos e digita seus nomes e notas em
seguida é exibida a mensagem:
i. Nome = JUCA. Nota AC1 = 8.0.
ii. Nome = MARCOS. Nota AC1 = 10.0.
 */
public class exercicio_5 {
    
    public static void imprimir(int num, String nome[], float nota[]){
        System.out.println("----- Resultado Final -----");
        for (int i = 0; i < num; i++) {
            System.out.println("| Nome do "+(i+1)+"° aluno: "+nome[i]+"  |");
            System.out.println("| Nota do aluno "+nome[i]+": "+nota[i]+" |");
            System.out.println("-------------------------------------------");
        }
    }
    
    public static void cadastrar (int num, String nome[], float nota[]){
        for (int i = 0; i < num; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° aluno: ");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do "+nome[i]+" (aluno "+(i+1)+"): "));
        }
    }
    
    public static void main(String[] args) {
        int val = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cadastros: "));
        String nome[] = new String [val];
        float nota[] = new float [val];
        cadastrar(val, nome, nota);
        imprimir(val, nome, nota);
        System.out.println("^w^");
    }
}
