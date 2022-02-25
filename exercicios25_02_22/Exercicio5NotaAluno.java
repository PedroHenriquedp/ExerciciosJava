package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio5NotaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1,n2,n3,n4;
		Scanner ler = new Scanner(System.in);
		
		//Coletando informações
		System.out.println("Qual foi as três notas do aluno?");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		//Cálculo
		n1 = n1*0.2;
		n2 = n2*0.3;
		n3 = n3*0.5;
		n4 = n1+n2+n3;
		
		//Resultado
		System.out.println("A nota do aluno é "+n4);
	}

}
