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
	
	
}
