package exercicios03_03_22;

import java.util.Scanner;

public class Ex1TresInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scanner
		Scanner ler = new Scanner(System.in);
		
		int x, y, z;
		
	//Coletando informações
		System.out.println("Por favor insera os valores para as seguintes variáveis");
		System.out.println("Valor para 'x'");
		x = ler.nextInt();
		System.out.println("Insira o valor para 'y'");
		y = ler.nextInt();
		System.out.println("Insira o valor para 'z'");
		z = ler.nextInt();
		
	//Declaração de qual é o maior
		
		//X maior valor
		if(x>y && x>z)
		{
			System.out.println("x é o maior valor "+x);
		}
		
		//Y maior valor
		else if (y>x && y>z)
		{
			System.out.println("y é o maior valor "+y);
		}
		
		//Z maior valor
		else if(z>y && z>x)
		{
			System.out.println("z é o maior valor "+z);
		}
		else
		{
			System.out.println("Nenhum número é maior!");
		}
		
	}

}
