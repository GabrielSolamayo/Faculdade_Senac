/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author gabriel.esmunoz
 */
public class MetodosLista {
    
    private static Elemento inicio = null, atual, aux;
    
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
    
}
