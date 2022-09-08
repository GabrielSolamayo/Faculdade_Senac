/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_8;


import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collection;
/**
 *
 * @author gabriel.esmunoz
 * Criação do método pilha;
 */
public class pilha {
    
   int TAM = Integer.parseInt(JOptionPane.showInputDialog(
			"Digite o tamanho da Pilha"));
    int topo; // variável com o topo da Pilha inicialmente vazia == -1

    public Object[] pilha; //Criando um Objeto que representa uma pilha

    public pilha() //construtor da classe Pilha 
    {		
            this. topo = -1;
            this.pilha = new Object[TAM]; // criando uma pilha com tamanho definido
    }


    public boolean pilhaVazia() 
    {
            if (this. topo == -1) //Verifica o topo se for -1 a pilha está vazia
            {
                    return true;
            }
            return false;
    }

    public boolean pilhaCheia() 
    {
            if (this.topo == TAM-1) //Verifica o topo se for -1 a pilha está vazia
            {
                    JOptionPane.showMessageDialog(null, "A pilha está Cheia");
                    return true;
            }
            return false;
    }

    public int tamanho() 
    {
            if (this.pilhaVazia()) 
            {
                    return 0; // aqui indica que não tem nenhum conteúdo dentro da pilha
            }
            return this. topo + 1; //indica quantos itens há na pilha, 
            //somando-se 1, pois a pilha inicia no zero. 
    }

    public void empilhar(Object o) 
   {
            //this.topo < this.pilha.length - 1
            if (pilhaCheia()) //posicaoPilha é menor do que o tamanho da pilha
            {  
                    JOptionPane.showMessageDialog(null, "A pilha está Cheia");
            }
            else
            {
                    this.pilha[++topo] = o;	
                    System.out.println("Inserido: " + o.toString());
            }
    }

    public Object desempilhar() {
            //pop
            if (pilhaVazia()) // verificamos se a pilha esta vazia,
            {
                    JOptionPane.showMessageDialog(null, "A pilha está vazia");
                    return null;
            }
            return this.pilha[this. topo --];//decrementa o atributo topo
    }
   
    public static void main(String[] args) {
        pilha p = new pilha();
		p.empilhar("Portuguesa ");
		p.empilhar("Frango com catupiry ");
		p.empilhar("Calabresa ");
		p.empilhar("Quatro queijos ");
		p.empilhar("Camarão com mussarela de búfala ");	
		p.empilhar(p.TAM); //tentando inserir o tamanho na Pilha		
		aluno novo = new aluno();
		novo.nome = "Marcos";
		novo.nota = 7.85f;
		p.empilhar(novo); //Inserindo um Aluno na pilha		
		System.out.println("Imprimindo a Pilha ");
		while (!p.pilhaVazia()) 		{
			System.out.println(p.desempilhar());
                } 
    }
}
    
  
    
    
    
    
    
//    public static void imprimir(int pilha[]){
//        for (int i = 0; i < pilha.length; i++) {
//            if(i == pilha.length - 1){
//                System.out.print(pilha[i]);
//            }else{
//                System.out.print(pilha[i]+", ");
//            }
//        }
//    }
//    
//    public static void inserir(int pilha[]){
//        System.out.println("---- Inserindo Dados ----\n");
//        for (int i = 0; i < pilha.length; i++) {
//            pilha[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da "+(i+1)+"° posição: "));
//        }
//    }
//    
//    public static void remover(int pilha[], int posição){
//        pilha[posição-1] = 0;
//    }
//    
//    public static void main(String[] args) {
//        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha: "));
//        int pilha[] = new int[tamanho];
//        inserir(pilha);
//        imprimir(pilha);
//        int dado_remov = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que deseja remover: "));
//        remover(pilha, dado_remov); 
//        System.out.println("");
//        imprimir(pilha);
//    }

