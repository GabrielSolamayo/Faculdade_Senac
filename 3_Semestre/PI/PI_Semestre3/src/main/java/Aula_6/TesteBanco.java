/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_6;

/**
 *
 * @author gabriel.esmunoz
 */
public class TesteBanco {
    public static void main(String[] args) {
        AcessaBanco acessabanco = new AcessaBanco();
        
        acessabanco.setLogin("Gabriel");
        acessabanco.setConectado(false);
        if(acessabanco.isConectado() == true){
            System.out.println("Nome: "+acessabanco.getLogin());
            System.out.println("Conexão: Online");
        }else{
            System.out.println("Conexão: Offline"); 
        }
        
    }
}
