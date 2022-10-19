/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_1;

/**
 * a) Atributos: marca (String), categoria (String), preco (double), id (int), quantidade (int);
b) Dois construtores (Um padrão e outro com todos os parâmetros exceto id - Atenção, leia o item c), setters e getters;
c) Ao construir, crie uma lógica para atribuir id sequencial, a partir de 5000.
d) Um método que realize o desconto de 5% no preço de produtos de uma determinada marca. Invoque esse método no construtor.

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
        setPreco(desconto(marca, preco));
        
    }
    //Construtor feito para deixar mais "agradavel" a busca no main;
    public Produto(int id){
        this.id = id;
    }
    public Produto(){
        
    }

    
    public double desconto(String marc, double valor) {
    	double val = ListaSimples.itemGratis(quantidade, preco);
    	if(marc.equalsIgnoreCase("Mr. Musculo")) {
    		 val = val -(0.05 * val); //aplicando o desconto de 5% se for da marca "Mr. Musculo";
    		 return val;
    	}
    	return val;
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
    	if(marca.equalsIgnoreCase("Mr roboto")) {
    		return "" + "ID: "+id+ "| Marca = " + marca + " | Categoria = " + categoria + " | Preco = R$" + preco + " | Quantidade = " + quantidade + "";
    	}
        
    }
    
    
    
}
