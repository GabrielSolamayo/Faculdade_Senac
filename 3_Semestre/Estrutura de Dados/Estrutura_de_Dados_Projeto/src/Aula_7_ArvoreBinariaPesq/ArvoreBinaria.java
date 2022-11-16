package Aula_7_ArvoreBinariaPesq;

public class ArvoreBinaria {
	
	private Elemento raiz, atual;
	
	public void inserir(int num) {
		if(raiz == null) { // Arvore Vazia;
			raiz = new Elemento(num);
		}else {
			atual = new Elemento (num);
			inserir(raiz, atual);
		}
	}
	
	private void inserir(Elemento e, Elemento atual) {
		if(atual.getNum() >= e.getNum()) { // Inserido a direita;
			if(e.getDir() == null) {
				e.setDir(atual);
			}else {
				inserir(e.getDir(), atual);
			}
		}else {
			if(e.getEsq() == null) {
				e.setEsq(atual);
			}else{
				inserir(e.getEsq(), atual);
			}
		}
	}

	public void ordem(Elemento e) {
		//Percorra sub esq;
		//Visite raiz;
		//Percorra sub dir;
		if(e != null) {
			ordem(e.getEsq());
			System.out.print(e.getNum()+" ");
			ordem(e.getDir());
		}
		
	}

	public void pre (Elemento e) {
		//Visite raiz;
		//Percorra sub esq;
		//Percorra sub dir;
		
		if(e != null) {
			System.out.print(e.getNum()+" ");
			pre(e.getEsq());
			pre(e.getDir());
		}
	}
	
	public void pos (Elemento e) {
		//Percorra sub esq;
		//Percorra sub dir;
		//Visite raiz;
		if(e != null) {
			pos(e.getEsq());
			pos(e.getDir());
			System.out.print(e.getNum()+" ");
		}
		
	}
	
	public Elemento getRaiz() {
		return raiz;
	}
}
