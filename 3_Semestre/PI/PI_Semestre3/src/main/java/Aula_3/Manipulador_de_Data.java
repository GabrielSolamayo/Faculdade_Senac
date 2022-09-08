/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;



import javax.swing.JOptionPane;
/**
 *
 * @author gabriel.esmunoz
 */
public class Manipulador_de_Data{
    public static void main(String[] args) {
        Data data = new Data();
        data.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o dia: ")));
        data.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")));
        data.ajustarMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o mes: ")));
        
        System.out.println("Hoje é dia: "+data.getDia());
        System.out.println("Do mes: "+data.getMes());
        System.out.println("Do ano: "+data.getAno());
        verificarAnoBissexto(data);
    }
    private static void verificarAnoBissexto(Data data) {
		if(data.isAnoBissexto())
			System.out.println(data.getAno() + " é um ano bissexto!!! ");
		else
			System.out.println(data.getAno() + " não é um ano é bissexto!!! ");		
	}
}
