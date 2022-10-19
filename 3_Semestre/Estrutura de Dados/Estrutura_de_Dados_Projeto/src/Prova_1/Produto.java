/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_1;

/**
 *
 * @author gabriel.esmunoz
 */
public class Produto {
    
    String marca, categoria;
    double preco;
    int id, quantidade;
    private static int somaID = 5000;

    public Produto(String marca, String categoria, double preco, int quantidade) {
        this.marca = marca;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        setId(somaID++);
        
    }
    //Construtor feito para deixar mais "agradavel" a busca no main;
    public Produto(int id){
        this.id = id;
    }
    public Produto(){
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "" + "ID: "+id+ "| Marca = " + marca + " | Categoria = " + categoria + " | Preco = " + preco + " | Quantidade = " + quantidade + "";
    }
    
    
}
