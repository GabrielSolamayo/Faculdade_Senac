package Projeto;

public class Conta {
	
	protected double saldo;
	private String numero;
	private Cliente titular;
	private Agencia agencia;
	private static double taxaCPMF = 0.038;
	
	
	//Metodos Construtores;
	public Conta(double saldo, String numero, Cliente titular, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
	}
	public Conta() {
		
	}
	
	
	//Getters and Setters;
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public double getTaxaCPMF() {
		return taxaCPMF;
	}
	
	public void setTaxaCPMF(double taxaCPMF) {
		this.taxaCPMF = taxaCPMF;
	}
	
	
	
	
	
	
	public void imprimeDados() {
//		System.out.println("======================================");
//        agencia.imprimeDados();
//        System.out.println("Numero da conta: " + numero);
//        titular.imprimeDados();
//        System.out.println("Saldo  : R$" + saldo);
//        System.out.println("CPMF devido: R$" + acumuladorCPMF);
//        System.out.println("========================================");
	}
	
}
