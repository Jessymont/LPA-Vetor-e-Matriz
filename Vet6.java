package Vetor;

import java.util.Scanner;

public class Vet6 {
//Faça uma função que receba um vetor com as médias finais dos alunos de uma
//turma e a quantidade de alunos da turma, calcule e devolva a média da turma.
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int qta;
		double []notas;
		System.out.println("Insira a quantidade de alunos ");
		qta=sc.nextInt();
		notas= new double[qta];
		preenche(notas,sc);
		System.out.println("A media da turma é "+ media(notas));

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
			soma+=n[i];
		}
		return soma/n.length;
	}

}
