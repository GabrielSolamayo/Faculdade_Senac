/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_1;

/**
 *
 * @author gabriel.esmunoz
 */
public class Elemento {
    
    private Object objeto;
    private Elemento prox;

    //Construtores
    public Elemento(Object objeto, Elemento prox) {
        this.objeto = objeto;
        this.prox = prox;
    }
    public Elemento() {
    }
    
    
    //Getters and Setters
    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }
    
    
    
}
