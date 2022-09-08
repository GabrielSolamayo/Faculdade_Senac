/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_4;

import javax.swing.JOptionPane;
//import caminhopackage.nomeclasse;

/**
 *
 * @author gabriel.esmunoz
 */
public class min_e_max {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor minimo: "));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor maximo: "));
        int aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de apostas: "));
        int jogadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogadas: "));
        long qntApos [] = new long [aposta];
        for(int j = 0 ; j < jogadas; j++){
            System.out.println("Jogada: "+(j+1));
            for(int i = 0; i < aposta; i++){
                qntApos[i] = (Math.round(Math.random()*(max - min)) + (min));
                System.out.print(qntApos[i]+" ");
                //System.out.print(Math.round(Math.random()* (max - (min) - (min)))+ " ");
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
