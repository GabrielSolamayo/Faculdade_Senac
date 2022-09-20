/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author gabriel.esmunoz
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Gabriel", "123456",0);
        Funcionario f2 = new Funcionario("Felipe", "123456",0);
        
        if(f1.equals(f2)){
            System.out.println("Igual");
            System.out.println("hashCode f1: "+f1.hashCode());
            System.out.println("hashCode f2: "+f2.hashCode());
        }else{
            System.out.println("Diferente");
            System.out.println("hashCode f1: "+f1.hashCode());
            System.out.println("hashCode f2: "+f2.hashCode());
        }
    }
}
