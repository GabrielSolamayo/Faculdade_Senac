/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;
import java.util.Arrays;
/**
 *
 * @author gabriel.esmunoz
 */
public class MergeSort 
{
	void merge(int array[], int p, int q, int r) 
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int M[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = array[p + i];
		
		for (int j = 0; j < n2; j++)
			M[j] = array[q + 1 + j];

		// variáveis auxiliares
		int i, j, k;
		i = 0;
		j = 0;
		k = p;

		// para ordem descendente use if(L[i] >= <[j])
		while (i < n1 && j < n2) 
		{
			if (L[i] <= M[j]) {
				array[k] = L[i];
				i++;
			} 
			else 
			{
				array[k] = M[j];
				j++;
			}
			k++;
		}

		while (i < n1) 
		{
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) 
		{
			array[k] = M[j];
			j++;
			k++;
		}
	}

	// Divide o array em dois sub arrays
	void mergeSort(int array[], int left, int right) 
	{
		if (left < right) 
		{
			int mid = (left + right) / 2;

			// chamada de divisão recursiva
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			// Chama função Merge para ordenar os arrays divididos
			merge(array, left, mid, right);
		}
	}

	public static void main(String args[]) 
	{
		int[] array = { 6, 5, 12, 10, 9, 1 };
		System.out.println("Antes da ordenação");
		for(int i=0; i<array.length ; i++)
		{
			System.out.print(array[i] + " ");
		}		
		System.out.println("");
		System.out.println("Depois da ordenação");
		MergeSort ob = new MergeSort();
	        ob.mergeSort(array, 0, array.length - 1);
                for(int i=0; i<array.length ; i++)
                    {
                            System.out.print(array[i] + " ");
                    }
	}
}


