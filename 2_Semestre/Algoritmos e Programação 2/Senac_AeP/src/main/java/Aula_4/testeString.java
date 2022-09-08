/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_4;

/**
 *
 * @author gabriel.esmunoz
 */
public class testeString {
    public static void main(String[] args) {
        String st = "Biologia é uma ciencia";
        String nova = st.concat("que estuda a vida!");
        System.out.println(st);
        System.out.println(nova);
        String nova2 = st.replace('o', 'a');
        System.out.println(st);
        System.out.println(nova2);
    }
}
