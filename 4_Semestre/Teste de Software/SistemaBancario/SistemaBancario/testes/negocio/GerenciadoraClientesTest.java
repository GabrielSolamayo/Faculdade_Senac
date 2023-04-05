package negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List.*;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class GerenciadoraClientesTest {
	
	private GerenciadoraClientes gerClientes;
	private int idCliente = 2;
	//private int idCliente02 = 2;

	@Before
	public void setUp() {
		
		//Criando alguns clientes;
		Cliente cliente01 = new Cliente(1, "Pedro Lima", 25, "pedrolima@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Maria Fernanda", 28, "mariafernanda@gmail.com", 2, true);
		
		//Inserindo os clientes criados na lista de clientes do banco;
		ArrayList<Cliente> clienteDoBanco = new ArrayList<>();
		clienteDoBanco.add(cliente01);
		clienteDoBanco.add(cliente02);
		
		//idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID para busca"));
		
		gerClientes = new GerenciadoraClientes(clienteDoBanco);
		
		//a) Abriu conexão com BD? Então...
		//b) Criou arquivos e pastas aqui? Então...
		//c) Inseriu clientes fictícios na base de dados especificamente para os testes desta classe? Então...
		
	}
	
	@After
	public void tearDown() {
		gerClientes.limpa();
		
		//a) Fecha Aqui!!!!!
		//b) Apaga todos eles aqui!!
		//c) Apaga eles aqui!!!
		
		
	}
	
	
	/**
	 * Teste básico da pesquisa de um cliente a partir do seu ID.
	 */
	
	
	@Test
	
	public void testePesquisaCliente() {
		
		Cliente cliente = gerClientes.pesquisaCliente(idCliente);
		
		assertThat(cliente.getId(), is(idCliente));
	}
	
	
	
	/**
	 * Teste básico da remoção de um cliente  a partir do seu ID
	 */
	
	@Test
	public void testeRemoveCliente() {
		/*========== Execução ============*/
		boolean clienteRemovido = gerClientes.removeCliente(idCliente);
		
		/*========== Verificação ==========*/
		
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(idCliente));
	}
	
	@Test
	public void testeIdade() throws IdadeNaoPermitidaException {
		
		/*========== Execução ============*/
		
		
		
		boolean clienteIdadae = gerClientes.validaIdade(cliente01.getIdade);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
