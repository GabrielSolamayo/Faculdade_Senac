/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_6;

/**
 *
 * @author gabriel.esmunoz
 */
public class InsertSort {
    
    static void imprimir(int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
    } //Imrpimir na tela o Vetor;
    
    public static void preencher_Matriz(int v[]){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)Math.round(Math.random()*15);
        }
    }
    
    public static void insertionSort(int []v) {
        for (int i = 1; i < v.length; i++) {
            int j = i;
            int x = v[j];
            while (j > 0 && x < v[j-1]) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = x;
        }
    }
    
    public static void main(String[] args) {
        int vetor[] = new int [10];
        preencher_Matriz(vetor);
        imprimir(vetor);
        System.out.println("");
        insertionSort(vetor);
        System.out.println("");
        imprimir(vetor);
    }
}
