/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Simplesmente_Encadeada;

/**
 *
 * @author gabriel.esmunoz
 */
public class Pet {
    
    private String especie;
    private String nome;
    private int idade;

    //Construtores;
    public Pet(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }
    public Pet() {
    }
    public Pet(String nome){
        this.nome = nome;
    }
    
    
    //Getters and Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pet: " + " Especie = " + especie + "\n"
                + "Nome = " + nome + "| Idade = " + idade + "\n";
    }
    
    
}
