/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_6;

/**
 *
 * @author gabriel.esmunoz
 */
public class Teste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        Teste t = new Teste();
        t.converter(c);
        t.converter(f);
        
    }
    
    public void converter(Object p){
        if (p instanceof Cliente) { //Verifica se o objeto p é uma instancia da classe Cliente;
            Cliente cli = (Cliente)p;
            cli.imprimir();
        }else{
            Funcionario fun = (Funcionario)p;
            fun.imprimir();
        }
    }
}
