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
		System.out.println("-------------------------------");
		System.out.printf("  Valor do Saque: %.2fR$\n",valor);
		System.out.println("-------------------------------");
		if(valor > (getSaldo() + getLimite())) {
			System.out.println();
			System.out.println("!!      Saldo Excedido        !!");
			System.out.println("!!  Retirando do crédito ...  !!\n");
			System.out.println("!! Saldo do crédito excedido  !!");
			System.out.println("!!    Saque não realizado     !!\n");
		}else if((getSaldo() - valor) < 0) {
			System.out.println();
			System.out.println("!!     Saldo Excedido      !!");
			System.out.println("!! Retirando do crédito... !!\n");
			System.out.println("Atualizando ....");
			sobra = (valor - getSaldo());
			setLimite(getLimite()-sobra);
			setSaldo(0);
			imprimeDados();
		}else {
		System.out.println("Atualizando ....\n");
		setSaldo(getSaldo() - valor);
		}
		
		
	}
}
