/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_5;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author gabriel.esmunoz
 */
public class busca_linear {
    
    static void imprimir(ArrayList<Integer>List){
        for (int i = 0; i < 10; i++) {
            System.out.print(List.get(i));
        }
    } //Imrpimir na tela o Vetor;
    
    public static int buscalinear(int v[], int x){
        for (int i = 0; i < v.length; i++) {
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
    
    public static void buscaLinear(ArrayList<Integer>List, int x){
        for (int i = 0; i < 10; i++) {
            if(List.get(i) == x){
                System.out.println("Item achado na "+(i+1)+"° posição");
            }
        }
    }
    
    public static void preencher_list(ArrayList<Integer>list){
        for (int i = 0; i < 10; i++) {
            list.add((int)Math.round(Math.random()*10));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //int vetor[] = new int [10];
        //ArrayList<Integer> linear = new ArrayList<Integer>();
        preencher_list(list);
        imprimir(list);
        System.out.println("");
        int proc = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que quer encontrar: "));
        //int resul = buscalinear(vetor, proc);
        buscaLinear(list, proc);
//        if(buscalinear(vetor, proc) > 0 ){
//            System.out.println("Achado na "+(buscalinear(vetor, proc)+1)+"° posição do vetor");
//        }else{
//            System.out.println("Valor não encontrado");
//        }
    }
}
