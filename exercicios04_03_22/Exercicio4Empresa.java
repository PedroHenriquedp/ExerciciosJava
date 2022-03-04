package exercicios04_03_22;

import java.util.Scanner;

public class Exercicio4Empresa {

	public static void main(String[] args) {
		Scanner yomu = new Scanner(System.in);
		int info=0,idd, se1betsu=0,sexo, se2betsu=0,se3betsu=0,mood,kibun1=0,kibun2=0,kibun3=0;
		int mn=0,hg=0,oc=0,toshiyori=0,wakai=0;
		
		
		while(info<150) {
		info++;
		System.out.println("Qual a idade? da pessoa "+info+"?");
		idd = yomu.nextInt();
		System.out.println("Qual o sexo da pessoa "+info+"?\n1=Feminino\n2=Masculino\n3=Outro");
		sexo = yomu.nextInt();
		if(sexo==1)
		se1betsu++;
		if(sexo==2)
		se2betsu++;
		if(sexo==3)
		se3betsu++;
		System.out.println("Qual o comportamento da pessoa?\n1 Se a pessoa é calma;\n2 Se a pessoa é nervosa\n3 Se a pessoa é agressiva");
		mood = yomu.nextInt();
		if(mood==1)
		kibun1++;
		if(mood==2)
		kibun2++;
		if(mood==3)
		kibun3++;
		if(sexo==1 && mood==2)
			mn++;
		if(sexo==2 && mood==3)
			hg++;
		if(sexo==3 && mood==1)
			oc++;
		if(idd>40 && mood==2)
			toshiyori++;
		if(idd<18 && mood==1)
			wakai++;
		}
		System.out.println("--RESULTADO DA PESQUISA!--");
		System.out.println("Pessoas calmas são: "+kibun1);
		System.out.println("Mulheres nervosas são: "+mn);
		System.out.println("Homens agressivos são: "+hg);
		System.out.println("Outros calmos são: "+oc);
		System.out.println("Pessoas acima de 40 anos nervosas: "+toshiyori);
		System.out.println("Pessoas abaixo de 18 anos calmas: "+wakai);
	}

}
