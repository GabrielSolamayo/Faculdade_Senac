/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5;

/**
 *
 * @author gabriel.esmunoz
 */
public class ImplementandoSobreescrita {
    public static void main(String[] args) {
		SuperClass superClasse = new SuperClass();
		superClasse.metodoImprimir();
		
		ClasseFilha classeFilha = new ClasseFilha();
		classeFilha.metodoImprimir();
	}
}
