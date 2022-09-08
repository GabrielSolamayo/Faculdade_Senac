/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5.Automoveis;

/**
 *
 * @author gabriel.esmunoz
 */
public class Veiculo {
    private String placa, tipo;
    private int ano;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public Veiculo(String placa, int ano, String tipo) {
        this.placa = placa;
        this.ano = ano;
        this.tipo = tipo.toUpperCase();
    }
    public Veiculo(){
    }

    
    public void mostrarDados() {
        System.out.println("---- DADOS DO VEICULO ----");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
    }
    
    
    
}
