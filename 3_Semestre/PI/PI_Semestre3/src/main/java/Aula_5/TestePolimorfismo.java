/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class TestePolimorfismo {
    public static void main(String[] args) {
        String valores[] = {"Cachorro" , "Gato", "Leão"};
	Object escolha = JOptionPane.showInputDialog(null, "Escolha um bicho" , "Cadastro de Bichos",
	JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
	Bicho b;	
	if (escolha.equals("Cachorro")){
		b = new Cachorro();
	}
	else if (escolha.equals("Gato")){
		b = new Gato();
	}	
	else
		b = new Bicho();
	b.fala();
    }
}
