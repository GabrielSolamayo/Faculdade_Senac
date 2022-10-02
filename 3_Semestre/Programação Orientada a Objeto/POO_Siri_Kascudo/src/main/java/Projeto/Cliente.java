/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto;

/**
 *
 * @author solam
 */
public class Cliente {
    private String Nome, CPF;

    public Cliente(String Nome, String CPF) {
        this.Nome = Nome;
        this.CPF = CPF;
    }
    public Cliente(){
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public  void mostrarInformacoes(){
        
    }
}
