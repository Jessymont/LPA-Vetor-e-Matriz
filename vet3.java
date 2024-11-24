package Vetores;

import java.util.Scanner;

public class vet3 {
//Faça um programa em Java modularizando que preencha um vetor de 50 posições
//com valores inteiros recebidos pelo teclado e, em seguida, mostre os valores
//na ordem inversa da que foram digitados.
	public static void main(String[] args) {
		int []vet=new int [5];
		preenche(vet);
		mostra(vet);
		mostrarinv(vet);

	}
	public static void preenche (int[]v) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um número: ");
		for (int i=0; i<v.length;i++) {
			v[i]=sc.nextInt();
		}
		sc.close();
	}
	public static void mostra (int[]v) { // mostra cada celula do vetor
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		} 
		System.out.println();// assegura que a proxima informação seja mostrada na linha seguinte 
	}
	public static void mostrarinv (int[]v) {
		for( int i=v.length-1; i>=0;i--) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}

}
