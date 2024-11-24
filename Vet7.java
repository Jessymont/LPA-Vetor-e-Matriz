package Vetor;

import java.util.Scanner;

public class Vet7 {
//Faça uma função que receba um vetor com as médias dos alunos de uma turma, a quantidade de alunos da turma
//e devolva quantos alunos ficaram acima da média da turma.
//Obs: use a função do exercício 6 para calcular a média da turma.
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int qta;
		double []notas;
		System.out.println("Insira a quantidade de alunos ");
		qta=sc.nextInt();
		notas= new double[qta];
		preenche(notas,sc);
		System.out.println("A media da turma é "+ media(notas));
		System.out.println(acima(notas)+" alunos estão acima da media ");

	}
	public static void preenche (double []n, Scanner sc) {
		for (int i=0; i<n.length;i++) {
		System.out.println("Insira a nota do aluno ");
		n[i]=sc.nextDouble();
		}
	}
	public static double media (double[]n) {
		int soma=0;
		for ( int i=0;i<n.length;i++) {
			soma+=n[i]; // soma recebe seu proprio valor mais o valor de n[i]
		}
		return soma/n.length; //divide o valor da soma pela quantidade de alunos
	}
	public static int acima (double[]n) {
		int contador=0;
		double md=media(n);
		for( int i=0; i<n.length;i++) {
			if(n[i]>md) {
				contador++;
			}
		}
		return contador;
	}


}
