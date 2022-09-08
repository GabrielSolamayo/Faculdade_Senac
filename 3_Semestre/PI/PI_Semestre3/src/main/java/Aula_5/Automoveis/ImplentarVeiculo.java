/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5.Automoveis;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel.esmunoz
 */
public class ImplentarVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Onibus busao = new Onibus(2, "KIC-2565", 2021,"");
        Caminhao caminhao = new Caminhao(70,"JJJ-6509",2022,"");
        
        veiculo.setPlaca("BDE-6419");
        veiculo.setAno(1995);
        
        busao.setPlaca("CTD-6582");
        
        caminhao.setAno(2003);
        
        veiculo.mostrarDados();
        busao.mostrarDados();
        caminhao.mostrarDados();
    }
}
