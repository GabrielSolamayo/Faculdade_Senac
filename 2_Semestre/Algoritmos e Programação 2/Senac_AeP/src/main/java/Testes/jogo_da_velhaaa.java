/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testes;
import java.util.Scanner;

/**
 *
 * @author gabriel.esmunoz
 */
public class jogo_da_velhaaa {
    
static void imprimirMa(String matriz[][]){
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[0].length; c++){
                System.out.print(matriz[l][c]+" ");
            }
            System.out.println("");
        }
    } //Funcao para mostrar na tela a qualquer matriz;

static void nada(String matriz[][], int coluna){
    Scanner scan =  new Scanner (System.in);
    System.out.println("---------------cixinha---------------------");
    System.out.print("Jogador 1  (X)  -  Escolha a linha = ");
    int linha = scan.nextInt();
//    System.out.print("Jogador 2  (X)  -  Escolha a coluna = ");
//    coluna = ler.nextInt();
//    matriz[linha][coluna] = "X";
}

static void preencher_jog1(String matriz[][], int linha, int coluna, Scanner ler){
        System.out.println("------------------coxinha------------------");
        System.out.print("Jogador 1  (X)  -  Escolha a Linha: ");
        linha = ler.nextInt();
        System.out.print("Jogador 1  (X)  -  Escolha a Coluna: ");
        coluna = ler.nextInt();
        System.out.println("");
        matriz[linha][coluna] = "X";
}//Funcao para o jogador 1 preencher a matriz;

static void preencher_jog2(String matriz[][], int linha, int coluna){
            Scanner ler = new Scanner(System.in);
            System.out.println("------------------------------------");
            System.out.print("Jogador 2  (O)  -  Escolha a Linha: ");
            linha = ler.nextInt();
            System.out.print("Jogador 2  (O)  -  Escolha a Coluna: ");
            coluna = ler.nextInt();
            System.out.println("");
            matriz [linha] [coluna] = "O";
}//Funcao para o jogador 2 preencher a matriz;

static boolean verificar(String matriz[][], int cont){
    if((matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2] == "X")||
       (matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X")||
       (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X")||
       (matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2] == "X")||
       (matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2] == "X")){
            System.out.println("Jogador 1 Venceu");
            return true;
    }else if((matriz[0][0] == "O" && matriz[1][1] == "O" && matriz[2][2] == "O")||
             (matriz[0][2] == "O" && matriz[1][1] == "O" && matriz[2][0] == "O")||
             (matriz[0][0] == "O" && matriz[0][1] == "O" && matriz[0][2] == "O")||
             (matriz[1][0] == "O" && matriz[1][1] == "O" && matriz[1][2] == "O")||
             (matriz[2][0] == "O" && matriz[2][1] == "O" && matriz[2][2] == "O")){
                System.out.println("Jogador 2 Venceu");
                return true;
            }else if(cont == 9){
                System.out.println("Jogo deu Empate");
                return true;
            }else{
                cont++;
                return false;
            }
}
    
    
    public static void main(String[] args) {
        String [][] matriz = {{ "+", "+", "+"},
			      { "+", "+", "+"},
                              { "+", "+", "+"}};
        boolean acabou = false;
        int linha = 0;
        int coluna = 0;
        int cont = 1;
        Scanner entrada = new Scanner(System.in);
        imprimirMa(matriz);
        do{
            System.out.println("----------------------------------");
            System.out.print("Jogador 1  (X)  -  Escolha a Linha: ");
            linha = entrada.nextInt();
            System.out.print("Jogador 1  (X)  -  Escolha a Coluna: ");
            coluna = entrada.nextInt();
            System.out.println("");
            matriz[linha][coluna] = "X";
            imprimirMa(matriz);
            acabou = verificar(matriz, cont);
            if(acabou == false){
                System.out.println("------------------------------------");
                System.out.print("Jogador 2  (O)  -  Escolha a Linha: ");
                linha = entrada.nextInt();
                System.out.print("Jogador 2  (O)  -  Escolha a Coluna: ");
                coluna = entrada.nextInt();
                System.out.println("");
                matriz [linha] [coluna] = "O";
                imprimirMa(matriz);
                System.out.println("");
            }    
        }while(acabou == false);  
    }
}
