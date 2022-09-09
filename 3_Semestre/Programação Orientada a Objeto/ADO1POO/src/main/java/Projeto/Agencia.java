package Projeto;

public class Agencia {
	private String numero;
	private Banco banco;
	
	

	public Agencia(String numero, Banco banco) {
        this.numero = numero;
        this.banco = banco;
    }
	
	public Agencia() {
		
	}
	
	public String getNumero() {
        return numero;
    }
	
	public void setNumero(String numero) {
        this.numero = numero;
    }
	
	public Banco getBanco() {
		return banco;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public void imprimeDados() {
		System.out.println("Número da Agencia: " +getNumero());
		banco.imprimeDados();
	}
}
