package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio8Consumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double fab, imp, dsp,kur,res;
		
		//Coletando informações
		System.out.println("Qual o seu nome?");
		String nome =ler.next();
		
		System.out.println("Quanto custa o valor do seu carro inicialmente?");
		kur = ler.nextDouble();
		
		//Cálculo
		fab = kur*0.28;
		imp = kur*0.45;
		res = kur+fab+imp;
		
		System.out.println(nome+", valor do carro final com impostos é R$"+res+" reais");
		
		
		
	}

}
