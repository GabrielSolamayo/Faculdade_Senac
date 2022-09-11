package ProjetoLivros;

public class Metodo_ArraysL {

	private static Livros lista[] = new Livros[10];
	private static int indiceAtual = 0;
	
	public static void inserir(Livros l){
        if(indiceAtual == lista.length){
            lista = alocarNovoArray();
        }
        l.setId(indiceAtual+1);
        lista[indiceAtual++] = l;
    }
	
	private static Livros[] alocarNovoArray(){
        Livros[] novo = new Livros[indiceAtual+4];
        //Copiando os objetos para o novo Array;
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }
	
	public static void imprimir(){
        for (int i = 0; i < indiceAtual; i++) {
            System.out.println(lista[i]);
      }
  }
}
