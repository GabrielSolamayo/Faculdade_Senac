/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class TesteArrayList {

    public static void main(String[] args) {
        int resp = 0;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        do {
            //Cria objetos da classe Funcionario
            Funcionario funcionario = new Funcionario(
                    JOptionPane.showInputDialog("Digite o nome do Funcionário: "),
                    JOptionPane.showInputDialog("Digite o telefone: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "))
            );

            funcionarios.add(funcionario);
            resp = JOptionPane.showConfirmDialog(null, "Cadastrar outro?");
        } while (resp == 0);

        imprimeFuncionarios(funcionarios);

        do {
            int indice = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o índice do Funcionário a ser removido: "));
            resp = JOptionPane.showConfirmDialog(null,
                    "Confirma a exclusão do funcionário: " + funcionarios.get(indice));
            if (resp == 0) {
                System.out.println("Funcionario removido: "
                        + (Funcionario) funcionarios.remove(indice));
            }
        } while (resp != 0);

        imprimeFuncionarios(funcionarios);
    }

    public static void imprimeFuncionarios(ArrayList funcionarios) {
        FuncionarioS func;
        System.out.println("Qtde de Funcionarios: " + funcionarios.size());
        for (int nCont = 0; nCont < funcionarios.size(); nCont++) {
            func = (FuncionarioS) funcionarios.get(nCont);
            System.out.println(nCont + "\n" + func);
        }
        System.out.println("------------------------- FIM --------------------------");
    }
}
