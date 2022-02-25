package exercicios25_02_22;

import java.util.Scanner;

public class Exercicio7Equacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d,e,f,x,y,sub1,sub2,sub3;
		
		System.out.println("Escreva os valores respectivamente para as variáveis \n'a,b,c,d,e,f'");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		e = ler.nextInt();
		f = ler.nextInt();
		sub1 = (c*e)-(b*f);
		sub2 = (a*f)-(c-d);
		sub3 = (a*e)-(b*d);
		
		x = sub1/sub3;
		y = sub2/sub3;
		
		System.out.println("x e y serão respectivamente\nx: "+x+"\ny: "+y);
				
	
	
	
	
	}

}
