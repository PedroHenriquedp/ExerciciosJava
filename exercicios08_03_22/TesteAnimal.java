package exercicios08_03_22;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal doubutsu = new Animal();
		Cachorro inu = new Cachorro();
		Cavalo uma = new Cavalo();
		Preguica preguica = new Preguica();
		
		//Dog
		inu.setNome("Jorge");
		inu.setIdade(7);
		inu.setSom("Rooof!! Roof!! Rof! Rooooof!!! rof");
		System.out.println("O nome do cachorro é "+inu.getNome().toUpperCase()+" tem "
				+inu.getIdade()+" anos de idade e faz "+inu.getSom());
		inu.comportamento();
		System.out.println("\n------");
		
		
		//Horse
		uma.setNome("Gustavo");
		uma.setIdade(23);
		uma.setSom("cLip-clOW, clEp-cLOw, Clip-clop,Clip-clop");
		System.out.println("O nome do cavalo é "+uma.getNome().toUpperCase()+" tem "
				+uma.getIdade()+" anos de idade e faz "+uma.getSom());
		uma.comportamento();
		System.out.println("\n------");
		
		//Sloth
		preguica.setNome("Claudinho");
		preguica.setIdade(5);
		preguica.setSom("aaaah aaaahh aaah ah aah aaaah");
		System.out.println("O nome da preguiça é "+preguica.getNome().toUpperCase()+" tem "
				+preguica.getIdade()+" anos de idade e faz "+preguica.getSom());
		preguica.comportamento();
		
		
	}
	
}
