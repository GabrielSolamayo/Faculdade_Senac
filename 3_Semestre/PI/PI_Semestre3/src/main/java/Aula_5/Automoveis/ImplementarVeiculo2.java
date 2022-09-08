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
public class ImplementarVeiculo2 {

    public static void main(String[] args) {
        String veiculos[] = {"Caminhão", "Onibus", "Veiculo"};
        Object escolha = JOptionPane.showInputDialog(null, "Escolha o tipo de Veiculo", "Cadastro Veiculos",
                JOptionPane.INFORMATION_MESSAGE, null, veiculos, veiculos[0]);
        Veiculo veiculo;

        if (escolha.equals("Caminhão")) {
            veiculo = new Caminhao(
                    Integer.parseInt(JOptionPane.showInputDialog("Digite a carga: ")),
                    JOptionPane.showInputDialog("Digite a placa do caminhão: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")),
                    "Caminhão: "
            );
        } else if (escolha.equals("Onibus")) {
            veiculo = new Onibus(
                    Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de passageiros: ")),
                    JOptionPane.showInputDialog("Digite a placa do ônibus: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")),
                    "Ônibus: "      
            );
        } else {
            veiculo = new Veiculo(
                    JOptionPane.showInputDialog("Digite a placa do veículo: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo: ")),
                    "Veículo: "
            );
        }
        veiculo.mostrarDados();
    }
}
