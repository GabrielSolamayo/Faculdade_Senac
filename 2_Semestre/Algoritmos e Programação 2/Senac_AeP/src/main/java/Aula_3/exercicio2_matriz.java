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
public class exercicio2_matriz {
    public static void main(String[] args) {
        int traco = 0;
        int matriz[][] =  new int [3][3];
        for(int linhas = 0; linhas < 3; linhas++){
            for(int colunas = 0; colunas < 3; colunas++){
                    matriz[linhas][colunas] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor ["+linhas+"]["+colunas+"]: "));
                if(linhas == colunas){ // Diagonal principal;
                        traco += matriz[linhas][colunas];
                }
            }
        }
        //Imprimir matriz
        for(int li = 0; li < 3; li++){
            for(int co = 0; co < 3; co++){
                System.out.print("["+matriz [li][co]+"] ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("O traco da diagonal principal é: "+traco);
    }
}
