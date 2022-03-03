package exercicios03_03_22;

import java.util.Scanner;

public class Ex3Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int idd;
		
		//Recebendo informações
		System.out.println("Olá! Como posso te chamar? ");
		String nome = ler.next();
		
		System.out.println(nome+" qual sua idade? ");
		idd = ler.nextInt();
		
		//Cálculo
		if(idd>= 1 && idd<=14)
		{
		System.out.println(nome+", você está na categoria Infatil");
		}
		
		else if(idd>=15 && idd<=17)
		{
		System.out.println(nome+", você está na categoria juvenil");
		}
		
		else if(idd>=18 && idd<=25)
		{
		System.out.println(nome+", você está na categoria adulto");
		}
		else
		System.out.println("Você não se encaixou em nenhuma categoria desta pesquisa :/");
		
		
		
		
	}

}
