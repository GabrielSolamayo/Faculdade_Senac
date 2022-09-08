/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_1;

import javax.swing.JOptionPane;

/**Criar um Programa para cadastra 5 notas de alunos.
 *
 * @author gabriel.esmunoz
 */
public class Notas_aula1 {
    public static void main(String[] args) {
                int notas [] = new int [5];
        for (int i = 0; i < notas.length; i++){// Laço de Cadastro.
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
        }
        for(int c = 0; c < notas.length; c++){ // Imrpimir as notas;
            System.out.println((c+1)+" nota: "+notas[c]);
        }
        System.out.println("^w^");
    }
}
