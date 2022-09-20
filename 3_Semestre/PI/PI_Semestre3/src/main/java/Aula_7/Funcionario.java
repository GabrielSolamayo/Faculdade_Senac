/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author gabriel.esmunoz
 */
public class Funcionario {

    private String nome;
    private String fone;
    private int idade;

    public Funcionario(String nome, String fone, int idade) {
        this.nome = nome;
        this.fone = fone;
        this.idade = idade;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
    public boolean equals(Object o) {
        if (o instanceof Funcionario) {
            Funcionario p = (Funcionario) o;
            if (this.getNome().equals(p.getNome()) && this.getFone().equals(p.getFone())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public int hashCode(){
        return this.fone.hashCode() + this.nome.hashCode();
    }
}
