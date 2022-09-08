/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_2;

import java.util.Random;
import java.text.DecimalFormat;
/**
 *
 * Elabore um algoritmo que defina um array para receber valores float, exiba 
 * todos os valores em um loop separado.    
 * 
 * @author gabriel.esmunoz
 */
public class Array3_DF {
    public static void main(String[] args) {
     float matriz[] = new float [10];
     Random rd = new Random();
     DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = 1+rd.nextFloat()*10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("matriz["+i+"] = "+df.format(matriz[i]));
        }
        for(float a:matriz){
            System.out.println(a);
        }
    }
}
