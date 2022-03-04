package exercicios04_03_22;

import java.util.Scanner;

public class Exercicio5numeros {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int sum=0,info=0,x=0;
		
		System.out.println("Qual o seu nome?");
		String nome = read.next();
		
		do {
			info++;
			System.out.println(nome+", coloque o valor de alguma tecla\nCaso queira parar digite 0");
			x = read.nextInt();
			sum+=x;
		} while (x!=0);
		
		System.out.println(nome+", a soma dos valores que você colocou é "+sum);
	}

}
