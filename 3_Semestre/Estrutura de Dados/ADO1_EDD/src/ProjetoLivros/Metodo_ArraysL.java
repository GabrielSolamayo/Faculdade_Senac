package ProjetoLivros;

import java.util.Random;

public class Metodo_ArraysL {

	private static Livros lista[] = new Livros[10];
	private static int indiceAtual = 0;
	
	public static int idInicial() {
		Random rd = new Random();
		int vi = 0, vf = 15;
		int b = vi+rd.nextInt(vf-vi);
		return b;
		
	}
	
	public static int idAleatorio(Livros l[]) {
		Random rd = new Random();
		int vi = 0, vf = 15, a = 0, cont = 0;
		boolean vb = false;
		while(vb == false) {
			a = vi+rd.nextInt(vf-vi);
			for (int i = 0; i < indiceAtual; i++) {
				if(a != lista[i].getId()) {
					cont++;
				}
			}
			if(cont == indiceAtual) {
				vb = true;
				return a;
			}
		}
		return -1;
	}
	
	public static void inserir(Livros l){
        if(indiceAtual == lista.length){
            lista = alocarNovoArray();
        }
        if(indiceAtual > 0) {
        	l.setId(idAleatorio(lista));
        	lista[indiceAtual++] = l;
        	//indiceAtual++;
        }else {
        l.setId(idInicial());
        lista[indiceAtual++] = l;
        //indiceAtual++;
        }
    }
	
	private static Livros[] alocarNovoArray(){
        Livros[] novo = new Livros[indiceAtual+4];
        //Copiando os objetos para o novo Array;
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }
	
	public static void imprimir(){
		mergeSortt(0, indiceAtual, lista);
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(lista[i]);
      }
  }
	
	static void mergeSortt (int inicio, int fim, Livros[] livros) {
		
		if(inicio < fim -1) {
			int meio = (inicio+fim)/2;
			
			mergeSortt(inicio, meio, livros);
			mergeSortt(meio, fim, livros);
			
			intercala(livros, inicio, meio, fim);
		}
	}
	
	private static void intercala(Livros[] livros, int ini, int meio, int fim) {
		
		Livros novo[] = new Livros[fim-ini];
		
		int i = ini, m = meio, pos = 0;
		
		while(i < meio && m < fim) {
			
			if(livros[i].getTitulo().compareToIgnoreCase(livros[m].getTitulo()) <= 0) {
				novo[pos] = livros[i];
				pos = pos+1;
				i = i+1;
			}else {
				novo[pos] = livros[m];
				pos = pos+1;
				m = m+1;
			}
		}
		
		while(i < meio) {
			novo[pos] = livros[i];
			pos = pos+1;
			i = i+1;
		}
		
		while(m < fim) {
			novo[pos] = livros[m];
			pos = pos+1;
			m = m+1;
		}
		
		for(pos = 0, i = ini; i < fim; i++, pos++) {
			livros[i] = novo[pos];
		}
	}
	
	public static Livros pesquisa(String titulo) {
		int inicio = 0, fim = indiceAtual-1, meio;
		while(inicio <= fim) {
			meio = (inicio+fim)/2;
			if(titulo.equalsIgnoreCase(lista[meio].getTitulo())) {
				System.out.println("RESULTADO DA PESQUISA: \n"+lista[meio].toString());
				return lista[meio];
			}else if(titulo.compareToIgnoreCase(lista[meio].getTitulo()) <= 0 ) {
				fim = meio-1;
			}else {
				inicio = meio+1;
			}
		}
		System.out.println("Livro nao encontrado");
		return null;
	}
}
