package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio4calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		//Vari�veis
		int careca,aguia,dread,underCut,cachiado,ondulado;
		
		//Coleta de informa��es
		System.out.println("Escolha o valor de A ");
		careca = ler.nextInt();
		
		System.out.println("Escolha o valor de B ");
		aguia = ler.nextInt();
		
		System.out.println("Escolha o valor de C ");
		dread = ler.nextInt();
		
		//C�lculo
		System.out.println("O valor de R = (A+B)^2");
		underCut = careca+aguia;
		System.out.println("O valor de S = (B+C)^2");
		ondulado = aguia+dread;
		System.out.println("O valor de D = (R+S)/2");
		cachiado = (underCut*underCut+ondulado*ondulado)/2;
		
		//Resultado
		System.out.println("O valor de D = "+cachiado+"\nO valor de R = "+underCut*underCut+"\nO valor de S = "+ondulado*ondulado);
		
		
	}

}
