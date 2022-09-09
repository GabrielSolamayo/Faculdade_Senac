package Projeto;

import javax.swing.JOptionPane;

public class TesteHeranca {
	public static void main(String[] args) {
		Banco Nubank = new Banco("Nubank", 0001);
		Banco Inter = new Banco("Inter", 0002);
		Banco Santander = new Banco("Santander", 0003);
		Banco Bradesco = new Banco("Bradesco", 0004);
		//Banco banco;
		Cliente cliente;
		Conta conta;
		Agencia agencia1 = new Agencia("001", Nubank);
		Agencia agencia2 = new Agencia("002", Inter);
		Agencia agencia3 = new Agencia("003", Santander);
		Agencia agencia4 = new Agencia("004", Bradesco);
		
		String bancos[] = {"Nubank", "Inter", "Santander", "Bradesco"};
		Object escolha = JOptionPane.showInputDialog(null, "Escolha o banco desejado: ", "Seleção de Banco",JOptionPane.INFORMATION_MESSAGE, null, bancos, bancos[0]);
		
		if(escolha.equals("Nubank")){
			cliente = new Cliente(
					JOptionPane.showInputDialog(null,"Digite seu Nome: ","Cadastro "+escolha,JOptionPane.INFORMATION_MESSAGE),
					JOptionPane.showInputDialog(null,"Digite seu CPF: ","Cadastro "+escolha,JOptionPane.INFORMATION_MESSAGE)
			);
			
			conta = new Conta(
					Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu saldo: ","Cadastro "+escolha,JOptionPane.INFORMATION_MESSAGE)),
					"",
					cliente,
					agencia1
			);
		}
	}
}
