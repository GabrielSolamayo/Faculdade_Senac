/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_1;

import java.util.Random;

/**
 *
 * Elabore um algoritmo que armazene 30 numeros inteiros aleatorios e exiba-os;
 *
 * @author gabriel.esmunoz
 */
public class Random_1 {

    public static void main(String[] args) {
//        int v[]; //referencia
//        v = new int [30]; //Alocação do Array
        int vi= 0, vf=101;
        int v[] = new int[30];
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) { //Alimentando o Array
            v[i] = vi+rd.nextInt(vf-vi);
            System.out.println("v["+i+"] = "+v[i]);
        }
    }
}
