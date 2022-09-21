package ProjetoLivros;

public class Livros {

	private int id;
	private String autor, titulo;
	private double preco;
	
	
	
	public Livros() {
		
	}
	public Livros( String autor, String titulo, double preco) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.preco = preco;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
    public String toString() {
        return  ""+ "Livro = " + titulo + " | ID = " + id+ " | Autor = " + autor + "";
    }
}
