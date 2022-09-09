/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoHolite;

/**
 *
 * @author gabriel.esmunoz
 */
public class Mensalista extends Colaborador{
    private double valorSalarioMensal;

    public Mensalista(double valorSalarioMensal, String funcional, String nomeColab, String enderecoColab, String dataAdmissaoColab) {
        super(funcional, nomeColab, enderecoColab, dataAdmissaoColab);
        this.valorSalarioMensal = valorSalarioMensal;
    }

    public double getValorSalarioMensal() {
        return valorSalarioMensal;
    }

    public void setValorSalarioMensal(double valorSalarioMensal) {
        this.valorSalarioMensal = valorSalarioMensal;
    }
    
    public double calcularSalario(){
        return 1.0;
    }

    public void imprimeDados() {
    }
    
    
}
