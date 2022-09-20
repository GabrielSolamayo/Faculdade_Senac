/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author gabriel.esmunoz
 */
public class ClienteBanco {
    private String nome;
    private String CPF;
    private String endereco;

    public ClienteBanco(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    public ClienteBanco(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "" + "O Sr. " + nome + " portador do CPF " + CPF + " residente e domiciliado a " + endereco + " vem por meio desta solicitar o encerramento da sua conta corrente.";
    }
    
    public static void main(String[] args) {
        
        ClienteBanco cliente = new ClienteBanco("Gabriel Enrique", "123.456.789-10", "Rua Alvarenga Peixoto, 131");
        System.out.println(cliente);
        
        
    }
}
