package exercicios25_02_22;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicio3Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tH, tM, tS, tP;
		Scanner ler = new Scanner(System.in);
		
		//Nome
		System.out.println("Qual o seu nome?");
		String nome = ler.next();
		
		//Tempo do processo
		System.out.println("Escreva (em segundos) quanto tempo demora o processo?");
		tP = ler.nextInt();
		
		long hours = TimeUnit.SECONDS.toHours(tP);
		tP -= TimeUnit.HOURS.toSeconds(hours);
		
		long minutes = TimeUnit.SECONDS.toMinutes(tP);
		tP-= TimeUnit.MINUTES.toSeconds(minutes);
		
		long seconds = tP;
		System.out.println("\nOlá"+nome+"a duração do seu processo em horas, minutos e segundo foi "+hours+" horas "+minutes+" minutos, e "+seconds+" segundos.");
	}

}
