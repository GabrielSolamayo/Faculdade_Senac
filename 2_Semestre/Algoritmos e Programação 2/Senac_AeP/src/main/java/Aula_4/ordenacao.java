/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_4;

/**
 *
 * @author gabriel.esmunoz
 */
public class ordenacao {
    public static void bubbleSort(int [] vetor) {
        int aux = 0;
        for(int i = 0; i < vetor.length - 1; i++){
            for(int j = 0; j < vetor.length - i - 1; j++){
                if(vetor[j] > vetor[j+1]){
                     aux = vetor[j];
                     vetor[j] = vetor[j+1];
                     vetor[j+1] = aux;
                }
            }
        }
    }
}
