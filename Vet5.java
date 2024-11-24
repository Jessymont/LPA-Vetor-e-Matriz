package Vetor;

import java.util.Random;
import java.util.Scanner;

public class Vet5 {
//Faça uma função que receba um vetor com 50 números inteiros e um número.
//Ao final a função deve devolver quantas vezes o número recebido aparece no vetor.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int[] vet=new int[50];
		System.out.println("Digite um numero");
		n=sc.nextInt();
		preenche(vet);
		mostra (vet);
		System.out.println("O numero "+n+" aparece "+contar(vet,n)+" vezes.");
		

	}
	public static void preenche (int []v) {
		Random rand=new Random();
		for (int i=0;i<v.length;i++) {
			v[i]=rand.nextInt(10);
		}
	}
	public static void mostra (int []v) {
		for(int i=0; i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	public static int contar (int[]v, int n) {
		int contador=0;
		for(int i=0;i<v.length;i++) {
			if(n==v[i]) {
				contador++;
			}
		}
		return contador;
	}

}
