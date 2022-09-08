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
public class Ordenacao_Bolha_cres {
    
    static void imprimir(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
    } //Imrpimir na tela o Vetor;
    
    public static void bubbleSort(int vetor []){
        int aux = 0; //Fase de Ordenacao
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) { 
                if(vetor [j] > vetor [j+1]){ //Troca de elementos
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    } //Verificar e ordenar o vetor em ordem crescente;
    
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        int vetor[] = new int [tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)Math.round(Math.random()*50);
        }
        System.out.println("Vetor antes da ordenação");
        imprimir(vetor);
        bubbleSort(vetor);
        System.out.println("\n\nVetor após a ordenacao");
        imprimir(vetor);
    }
}
