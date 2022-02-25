package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio1AnosEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short ddA = 365;
		short ddM = 30;
		int idd, mdd, ddd, dias = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("Olá!!! Qual seu nome? ");
		String nome = ler.nextLine();

		System.out.println("Digite sua idade: ");
		idd = ler.nextInt();

		System.out.print("Digite quantos meses de vida você tem: ");
		mdd = ler.nextInt();

		System.out.println("Digite quantos dias de vida você tem: ");
		ddd = ler.nextInt();

		dias += (idd * ddA) + (mdd * ddM) + (ddd);

		System.out.println(nome + " você tem " + dias + " dias de vida :D");
	}

}
