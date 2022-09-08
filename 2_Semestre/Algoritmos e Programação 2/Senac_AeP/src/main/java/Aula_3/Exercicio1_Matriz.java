/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class Exercicio1_Matriz {
    
    static void inserirValorMatriz(int matriz[][]){
        for(int l = 0; l < matriz.length; l++){ //Laco para linhas
            for(int c = 0; c < matriz[0].length; c++){ //Laco para colunas
                matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor ["+l+"]["+c+"]: "));
            }
        }
    } //Funcao para inserir valores a matriz
    
    static int valorMaiorMatriz(int matriz[][]){
        int maior = 0;
        for(int l = 0; l < matriz.length; l++){ //Laco para linhas
            for(int c = 0; c < matriz[0].length; c++){ //Laco para colunas
                if(matriz[l][c] > maior){
                    maior = matriz[l][c];
                }
            }
        }
        return maior;
    } //Funcao para pegar o maior valor da matriz;
    
    static void ImprimirMatriz(int matriz[][]){
       for(int l = 0; l < matriz.length; l++){ //Laco para linhas
            for(int c = 0; c < matriz[0].length; c++){ //Laco para colunas
                System.out.print("["+matriz[l][c]+"]");
            }
            System.out.println("");
        } 
    }//Imprimir a matriz;
    
    public static void main(String[] args) {
        int matroz[][] = new int [1][1];
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas: "));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas: "));
        int matriz[][] = new int [linhas][colunas];
        inserirValorMatriz(matriz);
        int nuM = valorMaiorMatriz(matriz); // Chamando a funcao;
        ImprimirMatriz(matriz);//chamando o imprimir;
        System.out.println("");
        System.out.println("O maior valor da matriz é : "+nuM);
    }
}
