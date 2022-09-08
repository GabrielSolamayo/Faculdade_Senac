/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;

/**
 *
 * @author gabriel.esmunoz
 */
public class Carro {
    public static String placa = "ABD-1563";
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        System.out.println("Carro.placa: "+Carro.placa);
        System.out.println("Carro1.placa: "+carro1.placa);
        System.out.println("Carro2.placa: "+carro2.placa);
        System.out.println("");
        System.out.println("Alternando a placa do carro 1");
        carro1.placa = "DBX-4034";
        System.out.println("");
        System.out.println("Carro.placa: "+Carro.placa);
        System.out.println("Carro1.placa: "+carro1.placa);
        System.out.println("Carro2.placa: "+carro2.placa);
    }
}
