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
        
        ListaSimples.inserir(new Produto("Ype", "Amaciante", 3.0, 4));
        ListaSimples.inserir(new Produto("Veja", "Sabão em Pó", 2.0, 2));
        ListaSimples.inserir(new Produto("Mr. Musculo", "Limpeza", 4.0, 3));
        ListaSimples.inserir(new Produto("Cif", "Desifetante", 6.0, 4));
        ListaSimples.inserir(new Produto("Destac", "Agua Sanitária", 5.0, 1));
        
        ListaSimples.exibirNF();
        System.out.println("");
        
        
        ListaSimples.remover(5000);
        ListaSimples.exibirNF();
    }
}
