package Vetores;

import java.util.Random;

public class Vet2 {
//Faça uma função que receba 2 vetores com 10 números inteiros cada um e gere
//um terceiro vetor cujos elementos contém a soma dos elementos de
//mesmo índice dos outros dois vetores.
	public static void main(String[] args) {
		int []vet1=new int [10];
		int[]vet2=new int[10];
		int []vet3;
		preenche(vet1); // aciona o preenchimento do vetor
		mostra(vet1);// aciona mostrar os vetores
		preenche(vet2);
		mostra(vet2);
		vet3=soma(vet1,vet2); // define o vetor3
		mostra (vet3);
		
	}
	public static void preenche(int[]vet) { //preenche o vetor com numeros aleaatorios de 0 a 9
		Random rand=new Random();
		for (int i=0; i<vet.length;i++) {
			vet[i]=rand.nextInt(10); //sempre lembrar de colocar um limite de numeros no ()do random.
		}
	}
	public static void mostra(int[]vet) { // mostra cada celula do vetor
		for (int i=0; i<vet.length;i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println(); // assegura que a proxima informação seja mostrada na linha seguinte 
	}
	public static int[]soma(int[]v,int[]w){ //soma o vetor 1 com o vetor 2
		int[]vw=new int[v.length]; // define que o tamanho do vetor criado seja igual ao tamanho do 1 vetor inserido
		for(int i=0;i<v.length;i++) {
			vw[i]=v[i]+w[i];  //soma o valor das celulas e insere no vetor 3
		}
		return vw;// retorna o valor do vetor para o main
	}
	

}
