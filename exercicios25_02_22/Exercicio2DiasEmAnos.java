package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio2DiasEmAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ied, iea, iem; 
		Scanner ler = new Scanner(System.in);
		
		//Nome
		
		System.out.println("Qual o seu nome? ");
		String nome = ler.next();
		
		//Idade
		System.out.println("Quantos dias de vida você tem? ");
		ied = ler.nextInt();
		
		
		iea=ied/365;
		iem=ied/12;
		
		System.out.println(nome+" você tem " + iea + " anos ou " + iem + " meses ou " + ied + " dias de vida.");
		
	}

}
