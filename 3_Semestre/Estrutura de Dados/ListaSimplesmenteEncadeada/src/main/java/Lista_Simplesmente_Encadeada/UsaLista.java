/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Lista_Simplesmente_Encadeada;

/**
 *
 * @author gabriel.esmunoz
 */
public class UsaLista {

    public static void main(String[] args) {
        MetodosLista.inserir(new Pet("Canina", "Gabi", 4));
        MetodosLista.inserir(new Pet("Felina", "Mumu", 7));
        MetodosLista.inserir(new Pet("Felina", "Tutu", 8));
        MetodosLista.inserir(new Pet("Felina", "Tcha", 3));
        MetodosLista.inserir(new Pet("Canina", "Nani", 8));
        
        //MetodosLista.exibir();
        
        
        Object obj = MetodosLista.pesquisar("nani");
        if(obj != null){
            System.out.println("Resultado de Pesquisa: "+obj);
        }else{
            System.out.println("Resultado da Pesquisa: Item não Encontrado");
        }
        
        Pet pet = new Pet("Gabi"); //Instancia um novo objeto Pet para usar o Nome como busca no Remover;
        if(MetodosLista.remover(pet)){
            System.out.println("Item '"+pet.getNome()+"' Removido com Sucesso\n\n");
        }else{
            System.out.println("Item não remivo");
        }
        MetodosLista.exibir();
        
        pet = null; //Usado somente para consulta. Não será mais usado;
    }
}
