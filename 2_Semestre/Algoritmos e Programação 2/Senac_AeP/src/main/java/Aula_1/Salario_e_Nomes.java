/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class Salario_e_Nomes {
    public static void main(String[] args) {
        String nomes[] = new String[5];
        float salario[] = new float[5];
        for(int n = 0; n < nomes.length; n++){
            nomes[n] = JOptionPane.showInputDialog("Digite o Nome: ");
            salario[n] = Float.parseFloat(JOptionPane.showInputDialog("Digite o Salario: "));
        }
        for(int h = 0; h < salario.length; h++){
            System.out.println(nomes[h]+"");
            System.out.println(salario[h]+"");
            System.out.println("");
        }
    }
}
