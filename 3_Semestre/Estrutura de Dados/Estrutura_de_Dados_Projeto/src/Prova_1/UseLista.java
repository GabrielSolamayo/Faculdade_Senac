/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_1;

/**
 *
 * @author gabriel.esmunoz
 */
public class UseLista {
    
    public static void main(String[] args) {
        
        ListaSimples.inserir(new Produto("Ype", "Amaciante", 3.0, 10));
        ListaSimples.inserir(new Produto("Veja", "Sabão em Pó", 2.0, 10));
        ListaSimples.inserir(new Produto("Mr. Musculo", "Limpeza", 4.0, 10));
        ListaSimples.inserir(new Produto("Cif", "Desifetante", 6.0, 10));
        ListaSimples.inserir(new Produto("Destac", "Agua Sanitária", 5.0, 10));
        
        ListaSimples.exibir();
        System.out.println("");
        ListaSimples.comprar();
        
        
        
        
        ListaSimples.remover(5000);
        ListaSimples.exibir();
    }
}
