package Vetor;

import java.util.Scanner;

public class Vet4 {
//Faça uma função que receba um número inteiro N maior do que zero e preencha
//um vetor com os N primeiros termos da sequência de Fibonacci.
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       int n;
	       int []v;
	       System.out.println("Digite um número ");
	       n=sc.nextInt();
	       v=new int[n];
	       fibo(v);
	       mostrar(v);
	       
	    }
	    public static void fibo (int[]v) {
	    	int a=1, b=1,c=a+b;
	    	for (int i=0;i<v.length;i++) {
	    		v[i]=a;
	    		a=b;
	    		b=c;
	    		c=a+b;
	    	}
	    }
	    public static void mostrar (int[] v) {
	    	for(int i=0;i<v.length;i++) {
	    		System.out.print(v[i]+"  ");
	    	}
	    	System.out.println();
	    }
	}



