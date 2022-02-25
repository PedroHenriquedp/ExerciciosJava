package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio6PontosXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int x1=0,y1=0,x2=0,y2=0,num,menx,meny;
		double res,calx,caly;	
		//Coletando informações
		System.out.println("Escreva o valor de x1");
		x1 = ler.nextInt();
		System.out.println("Escreva o valor de y1");
		y1 = ler.nextInt();
		System.out.println("Escreva o valor de x2");
		x2 = ler.nextInt();
		System.out.println("Escreva o valor de y2");
		x2 = ler.nextInt();
		
		//Cálculo
		menx = x2-x1;
		meny = y2-y1;
		calx = Math.pow(menx, 2);
		caly = Math.pow(meny, 2);
		
		res = Math.sqrt(calx+caly);
		System.out.println("O resultado foi "+res);
		
	}

}
