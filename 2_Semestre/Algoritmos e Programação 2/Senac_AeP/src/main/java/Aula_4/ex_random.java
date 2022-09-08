/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_4;

/**
 *
 * @author gabriel.esmunoz
 */
public class ex_random {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10; i++){
            System.out.print(Math.round(Math.random()*(50 - (-50)) + (-50)) + " ");
        }
    }
}
