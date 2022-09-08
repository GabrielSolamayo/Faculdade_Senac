/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testes;

import java.util.Scanner;

/**
 *
 * @author gabriel.esmunoz
 */






public class askdafs {
    
    
    static void imprimirMa(String matriz[][]){
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c]+" ");
            }
            System.out.println("");
        }
    } //Funcao para mostrar na tela a qualquer matriz;
    
    
    
    
    
    
    public static void main(String[] args) {
        String [][] matriz = {{ "+", "+", "+"},
			      { "+", "+", "+"},
                              { "+", "+", "+"}};
        boolean acabou = false;
        int linha = 0;
        int coluna = 0;
        int cont = 1;
        Scanner entrada = new Scanner(System.in);
        imprimirMa(matriz);
        while(acabou == false){
            System.out.println("Jogador 1 digite linha: ");
            
        }
    }
}
