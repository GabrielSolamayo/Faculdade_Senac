/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author gabriel.esmunoz
 */
public class TestePessoinha {
    public static void main(String[] args) {
        Pessoinha p1 = new Pessoinha("Jessica", "752");
        Pessoinha p2 = new Pessoinha("Jessica", "752");
        
        if(p1 == p2){
            System.out.println("p1 é igual p2 com ==");
        }else{
            System.out.println("p1 != p2 com ==");
        }
        
        if(p1.equals(p2)){
            System.out.println("p1 é igual p2 com equals");
        }else{
            System.out.println("p1 é diferente p2 com equals");
        }
    }
}
