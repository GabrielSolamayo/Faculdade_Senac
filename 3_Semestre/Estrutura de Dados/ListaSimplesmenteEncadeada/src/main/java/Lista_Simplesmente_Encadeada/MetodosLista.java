/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Simplesmente_Encadeada;

/**
 *
 * @author gabriel.esmunoz
 */
public class MetodosLista {
    
    private static Elemento inicio = null, atual, aux;
    
    
    /**
     * Insere Objetos na lista simplesmente encadeada (ou ligada)
     * @param objeto Object
     */
    public static void inserir(Object objeto){
        if(inicio == null){
            //Lista Vazia;
            inicio = new Elemento(objeto, null);
            aux = inicio;
        }else{
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }
    
    /**
     * Exibe o conteúdo da lista simplemente encadeada (ligada);
     */
    public static void exibir(){
        Elemento e = inicio;
        while(e != null){
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }
    
    /**
     * PEsquisa em uma lista simplesmente encadeada;
     * @param nome String
     * @return Object
     */
    public static Object pesquisar(String nome){
        Elemento e = inicio;
        Pet pet;
        while(e != null){
            pet = (Pet)e.getObjeto(); //Cast para que retorne do tipo Pet e nao Object;
            if(nome.equalsIgnoreCase(pet.getNome())){
                return pet;
            }else{
                e = e.getProx();
            }
        }
        return null;
    }
    
    /**
     * Pesquisa para a operação de remover um elemento na lista simplesmente encadeada
     * @param pet Pet
     * @return Object [][]
     */
    private static Object [] pesquisar(Pet pet){
       Elemento ar = inicio;
       Elemento r = inicio;
       Pet petPesq;
       
       Object [] v = new Object [2];
       while(r != null){
           petPesq = (Pet)r.getObjeto();
           if(pet.getNome().equalsIgnoreCase(petPesq.getNome())){
               v[0] = r;
               v[1] = ar;
               return v;
           }
           ar = r;
           r = r.getProx();
       }
       return null;
    }
    
    
    /**
     * Remove um Elemento da Lista Simplesmente Encadeada;
     * @param pet Pet
     * @return Boolean
     */
    public static boolean remover(Pet pet){
        Object[] v = pesquisar(pet);
        if(v != null){
            Elemento r = (Elemento)v[0];
            Elemento ar = (Elemento)v[1];
            if(r == inicio){
                inicio = r.getProx();
                r.setProx(null);
            }else if(r == atual){
                atual = ar;
                aux = ar;
                ar.setProx(null);
            }else{
                ar.setProx(r.getProx());
                r.setProx(null);
            }
            return true;
        }
        
        return false;
    }
}
