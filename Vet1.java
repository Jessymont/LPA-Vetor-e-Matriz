package Vetores;

import java.util.Scanner;
import java.util.Random;

public class Vet1 {
//Implemente uma função que recebe por parâmetro um vetor de números inteiros
//e a quantidade de elementos do mesmo e informe a posição do maior número.
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int v;
		System.out.println("Digite o tamanho do vetor");
		v=sc.nextInt();
		int vet[]=new int [v];
		preenche(vet);
		mostra(vet);
	
		System.out.println("A posição do maior vetor é"+ maior (vet) );
	}
		
		public static void preenche(int[] vetor) {
			Random rand=new Random();
			for (int i=0; i<vetor.length;i++) {
				vetor[i]=rand.nextInt(10);
			}
		}
		
		public static void mostra (int []vet) {
			for (int i=0;i<vet.length;i++) {
				System.out.print(vet[i]+  " ");
			}
			System.out.println();
		}
		
		public static int maior (int []vet) {
			int maior= 0;
			for (int i=0;i<vet.length; i++ ) {
				if (vet[i]>vet [maior]) {
					maior=i;
				}
			}
			return maior;
		}
	}
