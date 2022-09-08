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
public class Matriz_exempli {
    public static void main(String[] args) {
        //int dimensao = Integer.parseInt(JOptionPane.showInputDialog("Digite a dimensao da matriz: ")); // Pergunta so para matrizes quadradas
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas: "));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas: "));
        int numeros [][] = new int [linhas][colunas];
        for(int l = 0; l < linhas; l++){ //Laco para linhas
            for(int c = 0; c < colunas; c++){ //Laco para colunas
                numeros[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor ["+l+"]["+c+"]: "));
            }
        }
        for(int li = 0; li < linhas; li++){
            for(int co = 0; co < colunas; co++){
                System.out.print("["+numeros [li][co]+"] ");
            }
            System.out.println("");
        }
    }
}
