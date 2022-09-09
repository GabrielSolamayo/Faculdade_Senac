/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoHolite;

/**
 *
 * @author gabriel.esmunoz
 */
public class ImplementaHolite {

    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        Horista horista = new Horista(28.4, 8.0, "02", "Anderson Lima", "Rua YY", "08/09/2022");
        Mensalista mensalista = new Mensalista(5000.0, "01", "Felipe Alves", "Rua XX", "09/09/2022");
        Professor professor = new Professor(28.4, 22, "003", "Vinicius Almeida", "Rua ZZ", "10/09/2022");

        professor.imprimeDados();
        System.out.println("");
        horista.imprimeDados();
        System.out.println("");
        mensalista.imprimeDados();
    }
}
