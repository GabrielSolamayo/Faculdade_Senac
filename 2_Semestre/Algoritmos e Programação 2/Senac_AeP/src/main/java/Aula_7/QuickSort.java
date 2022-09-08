/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author gabriel.esmunoz
 */
public class QuickSort {
    public static void main(String args[]) 
	{
		int[] array = { 6, 5, 12, 10, 9, 1 };
		 System.out.println("Antes da Ordenação:");
		 for(int i=0 ; i<array.length ; i++)
			 System.out.print(array[i] + " ");
		
		 QuickSort ob = new QuickSort();
		 ob.ordenarVetorDeInteiros(array);
		 System.out.println("\nDepois da Ordenação:");
		 for(int i=0 ; i<array.length ; i++)
			 System.out.print(array[i] + " ");
	}
	
	public void ordenarVetorDeInteiros(int[] vetor) 
	{
		quickSort(vetor, 0, vetor.length - 1);
	}
	private void quickSort(int[] vetor, int inicio, int fim) 
	{
		if(fim > inicio) 
		{
			//Chamada da rotina que ira dividir o vetor.
			int indexPivo = dividir(vetor, inicio, fim);
			/* Chamada recursiva para redivisao do vetor  */
			quickSort(vetor, inicio, indexPivo - 1);//para esquerda
			/* Chamada recursiva para redivisao do vetor */
			quickSort(vetor, indexPivo + 1, fim);//para direita
		}
	}
	private int dividir(int[] vetor, int inicio, int fim) 
	{
		int pivo, pontEsq, pontDir = fim;
		pontEsq = inicio + 1;
		pivo = vetor[inicio];

		while(pontEsq <= pontDir) 
		{
			while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) 
			{
				pontEsq++;
			}

			while(pontDir >= pontEsq && vetor[pontDir] > pivo) 
			{
				pontDir--;
			}
			if(pontEsq < pontDir) 
			{
				trocar(vetor, pontDir, pontEsq);
				pontEsq++;
				pontDir--;
			}
		}
		trocar(vetor, inicio, pontDir);
		return pontDir;
	}

	private void trocar(int[] vetor, int i, int j) 
	{
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
}
