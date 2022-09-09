/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoHolite;

/**
 *
 * @author gabriel.esmunoz
 */
public class Professor extends Colaborador{
    private double valorDaHoraAula;
    private int quantidadeDeAula;

    public Professor(double valorDaHoraAula, int quantidadeDeAula, String funcional, String nomeColab, String enderecoColab, String dataAdmissaoColab) {
        super(funcional, nomeColab, enderecoColab, dataAdmissaoColab);
        this.valorDaHoraAula = valorDaHoraAula;
        this.quantidadeDeAula = quantidadeDeAula;
    }
    public Professor(){
        
    }

    public double getValorDaHoraAula() {
        return valorDaHoraAula;
    }

    public void setValorDaHoraAula(double valorDaHoraAula) {
        this.valorDaHoraAula = valorDaHoraAula;
    }

    public int getQuantidadeDeAula() {
        return quantidadeDeAula;
    }

    public void setQuantidadeDeAula(int quantidadeDeAula) {
        this.quantidadeDeAula = quantidadeDeAula;
    }
    
    public double calculoSalarioProfessor(){
        double salarioProfessor = (this.getQuantidadeDeAula() * this.getValorDaHoraAula());
        return salarioProfessor;
    }
    public void imprimeDados(){
        double salarioProf = calculoSalarioProfessor();
        super.imprimeDados("PROFESSOR");
        System.out.printf("Salário: %.2f",salarioProf,"R$");
        System.out.println("");
    }
}
