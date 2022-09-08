/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gabriel.esmunoz
 */
public class MetodoArray {
    
    private static Pessoa[] lista = new Pessoa[4];
    private static ArrayList<Pessoa> list = new ArrayList<Pessoa>();
    private static int indiceAtual = 0;
    
    /**
     * Insere um objeto no array de objetos.
     * @param p Pessoa
     */
    public static void inserir(Pessoa p){
        if(indiceAtual == lista.length){
            lista = alocarNovoArray();
        }
        p.setId(indiceAtual+1);
        lista[indiceAtual++] = p;
        list.add(p);
    }
    
    
    /**
     * Método para imprimir na tela o Array;
     */
    public static void imprimir(){
//        for (Pessoa p : lista) {
//            System.out.println("Nome: "+p.getNome());
//            System.out.println("Idade: "+p.getIdade());
//            System.out.println(p);
//        }
          for (int i = 0; i < indiceAtual; i++) {
              //System.out.println(list.get(i));
              System.out.println(lista[i]);
        }
    }
    
    
    /**
     * Aloca um novo Array de tamanho 4 indices maior do que o anterior
     * @return Pessoa[]
     */
    private static Pessoa[] alocarNovoArray(){
        Pessoa[] novo = new Pessoa[indiceAtual+4];
        //Copiando os objetos para o novo Array;
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }
    
    
    /**
     * Pesquisa o id para remover do array, em outro método.
     * @param int id 
     * @return int meio
     */
    public static int pesquisar (int id){
        int inicio = 0, fim = indiceAtual - 1, meio;
        while(inicio <= fim){
            meio = (inicio + fim) / 2;
            if(id == lista[meio].getId()){//não pode compara com o objeto inteiro, é necessario o getID para pegar o ID do objeto pessoa
                return meio;
            }else if(id < lista[meio].getId()){
                fim = meio - 1;
            }else{
                inicio = meio + 1;
            }
        }
        return -1;
    }
    
    
    /**
     * Remove o conteudo do array como filtro o id
     * @param id 
     */
    public static boolean remover (int id){
        int indicePesq = pesquisar(id);
        if(indicePesq != -1){
            for (int i = indicePesq; i < indiceAtual-1; i++) {
                lista[i] = lista[i+1];
            }
            indiceAtual--;
            return true;
        }
        return false;
    }
    
    
    public static boolean mudarNome(int id){
        Scanner teclado = new Scanner(System.in); 
        int indicePesq = pesquisar(id);
        if(indicePesq != -1){
            System.out.print("Digite o novo nome: ");
            lista[indicePesq].setNome(teclado.next());
            return true;
        }
        return false;
    }
}
