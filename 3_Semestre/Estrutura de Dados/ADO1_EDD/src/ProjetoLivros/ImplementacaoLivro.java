package ProjetoLivros;

public class ImplementacaoLivro {

	public static void main(String[] args) {
		
		Metodo_ArraysL.inserir(new Livros( "Fernando Pessoa", "Livro do desassossego", 25.0));
		Metodo_ArraysL.inserir(new Livros( "Colleen Hoover e Priscila Catão", "O lado feio do amor", 25.0));
		Metodo_ArraysL.inserir(new Livros( "William Bennett", "O livro das virtudes para crianças", 25.0));
		Metodo_ArraysL.inserir(new Livros( "Sidarta Ribeiro", "O oráculo da noite: A história e a ciência do sonho", 25.0));
		Metodo_ArraysL.inserir(new Livros( "Taylor Jenkins Reid", "Os sete maridos de Evelyn Hugo", 25.0));
		Metodo_ArraysL.inserir(new Livros( "Lisa Kleypas", "Onde nascem os sonhos", 25.0));
		Metodo_ArraysL.inserir(new Livros( "George Orwell", "A revolução dos bichos: Um conto de fadas", 25.0));
		Metodo_ArraysL.inserir(new Livros( "William Peter Blatty", "O Exorcista", 25.0));
		Metodo_ArraysL.inserir(new Livros( "Colleen Hoover", "Novembro, 9", 25.0));
		Metodo_ArraysL.inserir(new Livros( "Ava Dellaira", "Cartas de amor aos mortos", 25.0));
		
		Metodo_ArraysL.imprimir();
		System.out.println("-----------------------------------------------------------------------------------------\n");
		Metodo_ArraysL.pesquisa("cartas de amor aos mortos");
		
	}
}
