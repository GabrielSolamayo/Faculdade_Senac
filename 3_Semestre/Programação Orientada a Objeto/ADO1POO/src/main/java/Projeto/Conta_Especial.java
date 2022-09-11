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
	
	public void saque(double valor) {
		double sobra = 0;
		double descTX = (valor / 100)*(super.getTaxaCPMF()*100);
		
		System.out.println("-------------------------------");
		System.out.printf("  Valor do Saque: %.2fR$\n",valor);
		System.out.println("-------------------------------");
		if(valor > (getSaldo() + getLimite() + descTX)) {
			System.out.println();
			System.out.println("!!      Saldo Excedido        !!");
			System.out.println("!!  Retirando do crédito ...  !!\n");
			System.out.println("!! Saldo do crédito excedido  !!");
			System.out.println("!!    Saque não realizado     !!\n");
		}else if(((getSaldo() - valor) - descTX) < 0) {
			System.out.println();
			System.out.println("!!     Saldo Excedido      !!");
			System.out.println("!! Retirando do crédito... !!\n");
			System.out.printf("--- Taxa CPMF aplicada : %.2fR$ --- \n",descTX);
			System.out.println("Atualizando ....\n");
			sobra = (valor - getSaldo());
			setLimite((getLimite()-sobra) - descTX);
			setSaldo(0);
			imprimeDados();
		}else {
		System.out.printf("--- Taxa CPMF aplicada : %.2fR$ --- \n",descTX);
		System.out.println("Atualizando ....\n");
		setSaldo((getSaldo() - valor) - descTX);
		imprimeDados();
		}
		
		
	}
}
