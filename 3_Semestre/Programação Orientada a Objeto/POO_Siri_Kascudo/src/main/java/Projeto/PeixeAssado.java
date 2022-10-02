/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto;

/**
 *
 * @author solam
 */
public class PeixeAssado extends Ingredientes implements Pagamento{
    
    final double gramaArroz = 0.700;
    final double gramaFeijao = 0.943;
    final double gramaPeixe = 1.234;
    final double gramaAlface = 0.334;
    final double gramaTomate = 0.443;
    
    public double valorDoPrato(){
        return 15.00;
    }
   
}

