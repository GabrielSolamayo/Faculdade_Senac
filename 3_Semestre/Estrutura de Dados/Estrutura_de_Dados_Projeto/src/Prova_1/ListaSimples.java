/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class ListaSimples {

    private static Elemento inicio = null, atual, aux;

    public static void inserir(Object objeto) {
        if (inicio == null) {
            //Lista Vazia;
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public static void exibir() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    private static Object[] pesquisar(Produto prod) {
        Elemento ar = inicio;
        Elemento r = inicio;
        Produto prodPesq;

        Object[] v = new Object[2];
        while (r != null) {
            prodPesq = (Produto) r.getObjeto();
            if (prod.getId() == prodPesq.getId()) {
                v[0] = r;
                v[1] = ar;
                return v;
            }
            ar = r;
            r = r.getProx();
        }
        return null;
    }

    public static boolean remover(int id) {
        System.out.println("Removendo o Id = " + id);
        Produto prod = new Produto(id);
        Object[] v = pesquisar(prod);
        if (v != null) {
            Elemento r = (Elemento) v[0];
            Elemento ar = (Elemento) v[1];
            if (r == inicio) {
                inicio = r.getProx();
                r.setProx(null);
            } else if (r == atual) {
                atual = ar;
                aux = ar;
                ar.setProx(null);
            } else {
                ar.setProx(r.getProx());
                r.setProx(null);
            }
            return true;
        }

        return false;
    }

    public static double itemGratis(int quant, double preco){
    	double valor;
        if(quant > 2){
             valor = preco * (quant - 1);
            return valor;
        }else {
        	 valor = preco * quant;
        	return valor;
        }
    }

    
}
