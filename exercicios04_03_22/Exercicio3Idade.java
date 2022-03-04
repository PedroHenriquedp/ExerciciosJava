package exercicios04_03_22;

import java.util.Scanner;

public class Exercicio3Idade {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idd=0,i,wakai=0,toshiyori=0,hito=0;
		
		System.out.println("Qual o seu nome?");
		String nome = ler.next();
		
		
		while(idd!=-99) {
			hito++;
			System.out.println(nome+" qual a idade da pessoa "+hito+"?");
			System.out.println("Digite -99 para parar o programa");
			idd = ler.nextInt();
			if(idd<21) {
				wakai++;
				
			}
			if(idd>50) {
				toshiyori++;
			}
		}
			System.out.println(nome+", \na quantidade de pessoas com menos de 21 anos é "+wakai);
			System.out.println("a quantidade de pessosas com mais de 50 anos é "+toshiyori);
			
		
		
	}
}
