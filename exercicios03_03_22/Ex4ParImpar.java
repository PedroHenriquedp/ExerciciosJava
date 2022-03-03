package exercicios03_03_22;

import java.util.Scanner;

public class Ex4ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		double nuq,num;
		
		//Usuário tela 1
		System.out.println("Olá, como posso te chamar?");
		String nome = ler.next();
		
		System.out.println(nome+", insira um número par ou ímpar, vamos fazer alguns cálculos");
		num = ler.nextDouble();
		
		//Cálculo
		nuq = Math.sqrt(num);
		
		//Usuário tela 2
		if(num%2!=0)
		{
			System.out.println("O número que você escreveu é ímpar, iremos elevar ao quadrado :D");
			System.out.println("O número ao quadrado é "+num*num);
			
		}
		else
		{
			System.out.println("O número que você escreveu é par, iremos fazer a raiz quadrada :D");
			System.out.println("A raiz quadrada do seu número é "+nuq);
		}
			
			
	}

}
