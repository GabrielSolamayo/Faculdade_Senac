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
public class busca_binaria {
    
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
    
    static void imprimir(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
    } //Imrpimir na tela o Vetor;
    
    public static void buscabinaria(int v[], int proc){
        int i, m, f;
        i = 0;
        if(proc < v.length / 2){
            
        }
    }
    
    public static int buscalinear(int v[], int x){
        for (int i = 0; i < v.length; i++) {
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
    
    public static void preencher_Matriz(int v[]){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)Math.round(Math.random()*10);
        }
    }
    
    public static void main(String[] args) {
        int vetor[] = new int [10];
        preencher_Matriz(vetor);
        bubbleSort(vetor);
        imprimir(vetor);
        System.out.println("");
        int proc = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor procurado: "));
        buscabinaria(vetor, proc);
    }
}
