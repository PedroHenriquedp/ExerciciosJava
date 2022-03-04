package exercicios04_03_22;

import java.util.Scanner;

public class Exercicio2Pares {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		int x[]= new int[10],i,par=0,imp=0;
		
		System.out.println("Olá, poderia informar seu nome?");
		String nome = ler.next();
		System.out.println(nome+", por favor insira 10 números. \nIrei mostrar quais são pares e quais são ímpares");
		for(i=0;i<x.length;i++) {
			x[i]= ler.nextInt();
			if(x[i]%2==0) {
				par++;
			}
			if(x[i]%2!=0) {
				imp++;
			}
		}
		
		System.out.println(nome+" você escreveu "+par+" números pares");
		System.out.println(nome+" você escreveu "+imp+" números ímpares");

	
	
	}
}