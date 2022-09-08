/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testes;

import Aula_5.busca_linear;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.esmunoz
 */
public class asasasd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //list.add(15);
        //list.add(19);
        for (int i = 0; i < 4; i++) {
            int cap = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "+(i+1)+"°: "));
            list.add(cap);
//            if( i == list.size() - 1){
//                
//            System.out.print(list.get(i)+"° ");
//            }else{
//                System.out.print(list.get(i)+"°, ");
//            }
        }
    }
}
