/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_2;


import java.util.Random;
import java.util.Arrays;
/**
 *
 *  Elaborar um algoritmo que receba numeros reais aleatorios de simples precisão 
 *  e armazene-os em um array bidimensional quadrado de ordem 5. Finalmente, apresente
 *  os valores da diagonal primária. 
 *
 * 
 * 
 * @author gabriel.esmunoz
 */
public class Array2 {
    
    //Imprimir a matriz Float, limitando a 2 casas;
    public static void imprimir(float matriz[][]){
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f ",matriz[i][j]);
                System.out.print(" | ");
            }
            System.out.println("");
        } 
    }
    
    public static void main(String[] args) {
        float matriz [][] = new float [5][5];
        Random rd = new Random();
        //Entrada de Valores Aleatorios;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextFloat()*100;
            }
        }
        imprimir(matriz);
        System.out.println("");
        //Substituindo todos fora da diagonal principal em 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i != j){
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Valores da Diagonal Principal:");
        System.out.println("");
        //Usando a biblioteca de Array para imprimir o Array em uma so linha;
        //System.out.println(Arrays.deepToString(matriz).replace("],", "],\n"));
        //imprimir(matriz);
        
        //Utilizando o "for aprimorado" para percorrer uma matriz;
        for(float[] linha:matriz){
            for(float coluna:linha){
                System.out.printf("%.2f",coluna);
                System.out.print(" | ");
            }
            System.out.println("");
        }
    }
}
