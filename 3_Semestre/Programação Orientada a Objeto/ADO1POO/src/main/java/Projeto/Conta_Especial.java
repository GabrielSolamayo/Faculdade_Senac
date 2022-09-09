package Projeto;

public class Conta_Especial extends Conta{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public Conta_Especial(double saldo, String numero, Cliente titular, Agencia agencia, double limite) {
		super(saldo, numero, titular, agencia);
		this.limite = limite;
	}
	public Conta_Especial(){
		
	}
	
	public void imprimeDados() {
		System.out.println("==== CONTA ESPECIAL ====\n");
		super.imprimeDados();
		System.out.printf("Limite atual: %.2fR$\n",getLimite());
	}
	
	public void saque() {
		
	}
}
