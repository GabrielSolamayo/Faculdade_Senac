/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_6;






/**
 *
 * @author gabriel.esmunoz
 */
public class TesteCastUp {
    public static void main(String[] args) {
        
     Cliente c = new Cliente(); //O objeto c foi declarado e instanciado com cliente;
     Funcionario f = new Funcionario();
     
     
     Pessoa p = (Pessoa)c; //Cast up explicito do objeto da classe Cliente para a classe Pessoa;
     Pessoa pf = (Pessoa)f;
     
     Pessoa p2 = c; //Cast up do objeto da calsse Cliente para a classe Pessoa;
     
     Pessoa p3 = new Cliente(); //Cast up do objeto da classe Ciete para a Pessoa;
     
     Object o = (Object) c; //Cast up explicito do objeto da classe Cliente para a classe Objeto;
     
     Object o2 = c; //Cast up do objeto da classe Cliente para aclasse Object
    }
}
