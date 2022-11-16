package Aula_7_ArvoreBinariaPesq;

public class UsaArvoreBinaria {
	
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.inserir(15);
		arvore.inserir(28);
		arvore.inserir(35);
		arvore.inserir(19);
		
		arvore.ordem(arvore.getRaiz());
		System.out.println("");
		arvore.pre(arvore.getRaiz());
		System.out.println("");
		arvore.pos(arvore.getRaiz());
	}
}
