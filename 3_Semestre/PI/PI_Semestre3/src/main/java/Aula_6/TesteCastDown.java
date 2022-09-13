/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_6;

/**
 *
 * @author gabriel.esmunoz
 */
public class TesteCastDown {
    public static void main(String[] args) {
        Cliente c = new Cliente(); 
        
        Pessoa p = c; //Cast up de Cliente para Pessoa
        
        Cliente c2 = (Cliente)p; //Cast down de Pessoa para Cliente;
        
        Pessoa p2 = new Pessoa(); //Criacao de uma instancia da classe Pessoa;
        
        Cliente c3 = (Cliente) p2; //Cast down invalido de Pessoa para Cliente;
    }
}
