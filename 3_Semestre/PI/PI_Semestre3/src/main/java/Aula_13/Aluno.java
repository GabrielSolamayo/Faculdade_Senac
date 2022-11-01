package Aula_13;

public class Aluno {

	private String nome, telefone;
	int id;
	
	
	
	public Aluno(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public Aluno() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Aluno \n"
				+ "Nome = " + nome + "\n"
				+ "Telefone = " + telefone + "\n"
				+ "ID = " + id + "\n";
	}
	
	
}
