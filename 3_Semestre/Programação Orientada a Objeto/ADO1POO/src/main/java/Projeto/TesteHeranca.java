package Projeto;

public class TesteHeranca {
	public static void main(String[] args) {
		
		Banco banco = new Banco("Santander", 01);
		
		Agencia agencia = new Agencia("001", banco);
		Agencia agencia2 = new Agencia("002", banco);
		Agencia agencia3 = new Agencia("003", banco);
		
		Cliente cliente1 = new Cliente("Gabriel Enrique", "123.456.789-00");
		Cliente cliente2 = new Cliente("Jorge Alberto", "123.456.789-10");
		Cliente cliente3 = new Cliente("José Benjamin", "123.456.789-20");
		
		Conta cont = new Conta(200.0, "101", cliente1, agencia);
		
		Conta_Especial contesp = new Conta_Especial(800.0, "10101", cliente2, agencia2, 400.0);
		Conta_Especial contesp2 = new Conta_Especial(700, "30303", cliente3, agencia3, 300.0);
		
		Conta_Poupanca contpop = new Conta_Poupanca(800.0, "20202", cliente1, agencia, "09/09/1999");
		
		//Imprimindo Dados das Contas;
		contesp.imprimeDados();
		
		//System.out.println();
		//contesp2.imprimeDados();
		//System.out.println();
		
		
		
		//contpop.imprimeDados();	
		//contpop.saque(900);
		//System.out.println();
	}
}
