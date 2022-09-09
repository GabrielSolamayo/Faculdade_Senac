/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;

/**
 *
 * @author gabriel.esmunoz
 */
public class Funcionario {

    public String nome;
    private String depto;
    private String funcao;
    private String endereco;

    public Funcionario(String nome) {
        System.out.println("X chamado"+nome);
    }
    public Funcionario(){
        System.out.println("Padrao Chamado");
    }
    
    
 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
