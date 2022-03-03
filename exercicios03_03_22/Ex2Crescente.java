package exercicios03_03_22;

import java.util.Scanner;

public class Ex2Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
			Scanner ler = new Scanner(System.in);
			
		int x,y,z;
				
		
		
		//Coletando informações
		System.out.println("Escreva um número para as variáveis a seguir");
		System.out.println("Insira o valor de 'x'");
		x = ler.nextInt();
		System.out.println("Insira o valor de 'y'");
		y = ler.nextInt();
		System.out.println("Insira o valor de 'z'");
		z = ler.nextInt();
		
		System.out.println("Ordem crescente:");
		
		//Ordem crescente
		
	if (x>=y && x>=z)
	{
		if(y>=z)
		{
			System.out.println(z);
			System.out.println(y);
			System.out.println(x);
		}
		else
			System.out.println(y);
			System.out.println(z);
			System.out.println(x);
	}
			
	else if(y>=x && y>=z)
	{
		if(x>=z)
		{
			System.out.println(z);
			System.out.println(x);
			System.out.println(y);
		}
		else
			System.out.println(x);
			System.out.println(z);
			System.out.println(y);
	}
	else if(z>=x && z>=y)
	{
		if(x>=y)
		{
			System.out.println(y);
			System.out.println(x);
			System.out.println(z);
		}
		else
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
	}
	
	
	
	
	
	}

}
