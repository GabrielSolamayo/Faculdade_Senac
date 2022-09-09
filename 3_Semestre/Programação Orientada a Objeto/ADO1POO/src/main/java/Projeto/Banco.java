package Projeto;

public class Banco {
	
	private String nome;
	private int numero;
	
	
	public Banco(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	public Banco() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void imprimeDados() {
		System.out.println("Nome do Banco: "+getNome());
		System.out.println("Número do Banco: "+getNumero());
	}




}
