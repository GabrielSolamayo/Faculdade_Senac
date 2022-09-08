/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_2;

/**
 *
 * @author gabriel.esmunoz
 */
public class ArrayObjetos {
    public static void main(String[] args) {
        MetodoArray.inserir(new Pessoa("Gerson", 38));
        MetodoArray.inserir(new Pessoa("José", 68));
        MetodoArray.inserir(new Pessoa("Anna", 58));
        MetodoArray.inserir(new Pessoa("Mel", 8));
        MetodoArray.inserir(new Pessoa("Gaia", 4));
        MetodoArray.inserir(new Pessoa("Tuu", 9));
        MetodoArray.inserir(new Pessoa("Mumu", 7));
        MetodoArray.inserir(new Pessoa("MRonda", 5));
        MetodoArray.imprimir();
        System.out.println("");
        System.out.println("=== REMOVENDO... ===");
        System.out.println("");
        boolean verifica = MetodoArray.remover(2);
        MetodoArray.remover(1);
        if(verifica){
            MetodoArray.imprimir();
        }else{
            System.out.println("ID não encontrado ;-;");
            System.out.println("");
        }
        boolean novoNome = MetodoArray.mudarNome(2);
        if(novoNome){
            System.out.println("");
            System.out.println("=== Lista Atualizada ===");
            System.out.println("");
            MetodoArray.imprimir();
        }else{
            System.out.println("ID não encontrado ;-;");
        }
    }
}
