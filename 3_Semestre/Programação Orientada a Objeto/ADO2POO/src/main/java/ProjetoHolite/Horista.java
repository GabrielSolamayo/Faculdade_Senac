/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoHolite;

/**
 *
 * @author gabriel.esmunoz
 */
public class Horista extends Colaborador{
    private double valorHora;
    private double cargaHoraria;

    public Horista(double valorHora, double cargaHoraria, String funcional, String nomeColab, String enderecoColab, String dataAdmissaoColab) {
        super(funcional, nomeColab, enderecoColab, dataAdmissaoColab);
        this.valorHora = valorHora;
        this.cargaHoraria = cargaHoraria;
    }
    public Horista(){
        
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void imprimeDados(){
        
    }
}
