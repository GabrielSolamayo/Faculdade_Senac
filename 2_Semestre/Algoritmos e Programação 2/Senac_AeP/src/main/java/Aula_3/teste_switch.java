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
public class teste_switch {
    public static void main(String[] args) {
        int a = 2;
        switch (a){
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("nenhum");
        }
    }
}
