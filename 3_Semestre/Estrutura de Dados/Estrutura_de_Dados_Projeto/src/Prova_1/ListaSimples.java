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

    public static void comprar() {
        Produto produto = new Produto();
        String x[] = new String[10];
        double y[] = new double[10];
        int cont = 0;
        boolean ver = false;
        while (ver != true) {
            String prod = JOptionPane.showInputDialog("Selecione o produto: ");
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade (Pegue mais de 3 e leve 1 de graça): "));
            if (itemGratis(quant)) {
                double valor = produto.getPreco() * (quant - 1);
                x[cont] = prod;
                y[cont] = valor;
                ProdutodG();
                cont++;
            } else {
                double valor = produto.getPreco() * quant;
                x[cont] = prod;
                y[cont] = valor;
                cont++;
            }
            String a = JOptionPane.showInputDialog("Deseja continuar comprando? (Y/N)");
            if (a.equalsIgnoreCase("No") || a.equalsIgnoreCase("N")) {
                ver = true;
            }
        }
    }

    public static boolean itemGratis(int quant){
        if(quant >= 3){
            return true;
        }
        return false;
    }
    
    public static void NotaF() {
        System.out.println("------- NOTA FISCAL -------");
        ProdutodG();
        ProdutosN();
    }
    
    public static void ProdutodG(){
        
    }
    
    public static void ProdutosN(){
        
    }
}
