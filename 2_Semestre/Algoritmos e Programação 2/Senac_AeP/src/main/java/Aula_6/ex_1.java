/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_6;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gabriel.esmunoz
 */
public class ex_1 {
    
    static void imprimir(ArrayList<Integer>List){
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + "\t");
        }
    } //Imrpimir na tela o Vetor;
    
    public static void insertionSORT(ArrayList<Integer>List){
        for (int i = 0; i < List.size(); i++) {
            int j = i;
            int x = List.get(j);
            while(j > 0 && x < List.get(j-1)){
                List.get(j) = List.get(j-1);
                j--;
            }
            List.get(j) = x;
        }
    }
    
    public static void insertionSort(ArrayList<Integer>List) {
        for (int i = 1; i < List.size(); i++) {
            int j = i;
            int x = List.get(j);
            while (j > 0 && x < List.get(j-1)) {
                List.get(j) = List.get(j-1);
                j--;
            }
            List.get(j) = x;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int vetor[] = {3, 5 ,9 ,11 ,15 ,17 ,19 ,6};
        imprimir(list);
        System.out.println("");
        insertionSort(list);
        System.out.println("");
        imprimir(list);
    }
}
