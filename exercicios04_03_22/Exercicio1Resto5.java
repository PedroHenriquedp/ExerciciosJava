package exercicios04_03_22;

import java.util.Scanner;

public class Exercicio1Resto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner ler = new Scanner(System.in);
		int x=1000;
		
		
		
		System.out.println("Ol�! Como posso te chamar?");
		String nome = ler.next();
		
		
		
		//C�lculo
		for(x=1000; x<1999;x++) {
			if(x%11==5) {
				System.out.println(x);
			}
		}
		System.out.println(nome+" acima temos os n�meros de 1000 at� 1999 que"+"\n"+"ao serem divididos por 11 t�m resto 5");
		System.out.println(nome+" Espero que tenha gostado :D");
			
	}

}
