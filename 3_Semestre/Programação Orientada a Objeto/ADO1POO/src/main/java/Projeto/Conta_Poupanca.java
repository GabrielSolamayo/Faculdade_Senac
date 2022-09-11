package Projeto;

public class Conta_Poupanca extends Conta{
	
	private String dataAniversario;

	
	
	public Conta_Poupanca(double saldo, String numero, Cliente titular, Agencia agencia,String dataAniversario) {
		super(saldo, numero, titular, agencia);
		this.dataAniversario = dataAniversario;
	}
	public Conta_Poupanca(){
            
        }
	
	//Getter and Setters;
	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	public void imprimeDados() {
		System.out.println("==== CONTA POUPANÇA ====\n");
		super.imprimeDados();
		System.out.println("Data de Aniversário: "+getDataAniversario()+"\n");
	}
	
	public void saque(double valor) {
		System.out.println("-------------------------------");
		System.out.println("  Valor do Saque: "+valor+"R$");
		System.out.println("-------------------------------");
		if((getSaldo() - valor) < 0) {
			System.out.println("!!   Saldo Excedido    !!");
			System.out.println("!! Saque não realizado !!\n");
			System.out.println("|| Adquira uma Conta Especial||\n"
					         + "|| para realizar esta tarefa ||\n");
			System.out.println("Atualizando ....");
			System.out.println();
			imprimeDados();
		}else {
		System.out.println("Atualizando ....\n");
		setSaldo(getSaldo() - valor);
		imprimeDados();
		}
	}
}
