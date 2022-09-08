/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_1;

/**
 *
 * @author gabriel.esmunoz
 */
public class Teste1 {

    public static void main(String[] args) {
        Mobilia mob = new Mobilia("Mesa", "Bergamo", "madeira/formica/metal", 115.0, 70.0, 90.0, 11.0);

        System.out.println("Mobilia:" + mob.getTipo());

        System.out.println("volume: " + mob.getVolume() + Transportavel.UNIDADE_VOLUME);

        System.out.println("peso: " + mob.getPeso() + Transportavel.UNIDADE_PESO);

        System.out.println("Empilhamento Max. : " + mob.getEmpilhamentoMaximo());

    }
}

