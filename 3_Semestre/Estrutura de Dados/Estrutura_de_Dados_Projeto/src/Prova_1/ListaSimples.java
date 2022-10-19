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

    public static void exibirNF() {
    	
        Elemento e = inicio;
        double total  = 0;
        while (e != null ) {
        	Produto prodPesq;
        	prodPesq = (Produto)e.getObjeto();
        	if(prodPesq.getMarca().equalsIgnoreCase("Mr. Musculo") && prodPesq.getQuantidade() > 2) {
        		System.out.print(e.getObjeto());
        		System.out.println(" | Desconto de 5% aplicado | Levando 1 item gratis");
        		total = total + prodPesq.getPreco();
                e = e.getProx();
        	}
        	else if(prodPesq.getQuantidade() >= 3){
        		System.out.print(e.getObjeto());
        		System.out.println(" | Levando 1 item gratis");
        		total = total + prodPesq.getPreco();
                e = e.getProx();
        	}else if(prodPesq.getMarca().equalsIgnoreCase("Mr. Musculo")) {
        		System.out.print(e.getObjeto());
        		System.out.println(" | Desconto de 5% aplicado");
        		total = total + prodPesq.getPreco();
                e = e.getProx();
        	}else {
	            System.out.println(e.getObjeto());
	            total = total + prodPesq.getPreco();
	            e = e.getProx();
        	}
        }
        System.out.println("-----------------------------------------\n"
        				 + "       TOTAL A PAGAR = R$"+total+"\n"
        				 + "-----------------------------------------");
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
