package exercicios03_03_22;

import java.util.Scanner;

public class Ex4ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		double nuq,num;
		
		//Usu�rio tela 1
		System.out.println("Ol�, como posso te chamar?");
		String nome = ler.next();
		
		System.out.println(nome+", insira um n�mero par ou �mpar, vamos fazer alguns c�lculos");
		num = ler.nextDouble();
		
		//C�lculo
		nuq = Math.sqrt(num);
		
		//Usu�rio tela 2
		if(num%2!=0)
		{
			System.out.println("O n�mero que voc� escreveu � �mpar, iremos elevar ao quadrado :D");
			System.out.println("O n�mero ao quadrado � "+num*num);
			
		}
		else
		{
			System.out.println("O n�mero que voc� escreveu � par, iremos fazer a raiz quadrada :D");
			System.out.println("A raiz quadrada do seu n�mero � "+nuq);
		}
			
			
	}

}
