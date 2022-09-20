/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author gabriel.esmunoz
 */
public class Pessoinha {

    private String nome;
    private String RG;

    public Pessoinha(String nome, String RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public Pessoinha() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public boolean equals(Object o) {
        if (o instanceof Pessoinha) {
            Pessoinha p = (Pessoinha) o;
            if (this.getNome().equals(p.getNome()) && this.getRG().equals(p.getRG())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
