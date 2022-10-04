/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
/**
 *
 * @author gabriel.esmunoz
 */
public class ExJLisT extends JFrame implements ListSelectionListener, ActionListener{
    JLabel l1; JTextField t1; JButton bquant, bindice, bclear; //Criando objetos Lable, Texto e Botões;
    
    JList lista; //Criando um objeto Lista;
    DefaultListModel listModel; //Criando objeto listModel a partir da classe DefaultListModel;
    
    public ExJLisT(){
        setSize(300, 250);
        setTitle("Uso do JList");
        t1 = new JTextField();
        t1.addActionListener(this);
        l1 = new JLabel("Sem selecao");
        l1.setForeground(Color.black);
        bquant = new JButton ("Quantidade de itens");
        bquant.addActionListener(this);
        bindice = new JButton("Indice Selecionado");
        bindice.addActionListener(this);
        bclear = new JButton("Remove item");
        bclear.addActionListener(this);
        listModel = new DefaultListModel();
        listModel.addElement("Banana");
        listModel.addElement("Pera");
        listModel.addElement("Maça");
        listModel.addElement("Uva");
        lista = new JList(listModel);
        lista.addListSelectionListener(this);
        JScrollPane Painel = new JScrollPane(lista);
        setLayout(new GridLayout(6, 1));
        add(l1);
        add(t1);
        add(Painel);
        add(bquant);
        add(bindice);
        add(bclear);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == t1){
            listModel.addElement(t1.getText());
            t1.setText("");
        }else if(e.getSource() == bquant){
            t1.setText("Quantidade: "+listModel.getSize());
        }else if(e.getSource() == bindice){
            t1.setText("Indice selecionados: "+lista.getSelectedIndex());
        }else if(e.getSource() == bclear){
            int resp = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do item "+lista.getSelectedValue());
            if(resp == 0){
                int index = lista.getSelectedIndex();
                l1.setText("Removido: "+lista.getSelectedValue());
                listModel.remove(index);
            }
        }
    }
    
    public void valueChanged(ListSelectionEvent e){
        l1.setText("Indice Selecionado: "+lista.getSelectedValue());
    }
            
    public static void main(String[] args) {
        new ExJLisT();
    }
}
