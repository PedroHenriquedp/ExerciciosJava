package exercicios04_03_22;

import java.util.Scanner;

public class Exercicio6numero {
			public static void main(String[] args) {
				
				Scanner ler = new Scanner(System.in);
				int info=0,x=0,ave=0;
				
				System.out.println("Qual o seu nome?");
				String nome = ler.next();
				
				do {
					System.out.println(nome+", coloque o valor de alguma tecla\nCaso queira parar digite 0");
					x = ler.nextInt();
					if(x%3==0)
					ave+=x;
					info++;
				} while (x!=0);
				
				
				System.out.println(nome+", a m�dia dos valores divis�veis por 3 � exatamente "+ave/info+" !!!");
				
				
				
			}
}
