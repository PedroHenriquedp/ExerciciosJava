package exercicios09_03_22;

public class TesteAnimal {
		public static void main(String[] args) {
			Cavalo biu = new Cavalo();
			Cachorro jorge = new Cachorro();
			Preguica apolo = new Preguica();
			
			//Cavalo
			biu.setNome("Gustavo");
			biu.setIdade(18);
			biu.setPreguicoso(false);
			System.out.println("O nome do cavalo � "+biu.getNome().toUpperCase()+
					" tem idade de "+biu.getIdade()+" anos. � pregui�oso? "+biu.getPreguicoso());
			biu.locomocao();
			biu.som();
			System.out.println("\n ");
		
			//Cachorro
			jorge.setNome("Jorge");
			jorge.setIdade(2);
			jorge.setPreguicoso(false);
			System.out.println("O nome do cachorro � "+jorge.getNome().toUpperCase()+
					" tem idade de "+jorge.getIdade()+" anos. � pregui�oso? "+jorge.getPreguicoso());
			jorge.locomocao();
			jorge.som();
			System.out.println("\n ");
		
			//Pregui�a
			apolo.setNome("Larissa");
			apolo.setIdade(3);
			apolo.setPreguicoso(true);
			System.out.println("O nome do cachorro � "+apolo.getNome().toUpperCase()+
					" tem idade de "+apolo.getIdade()+" anos. � pregui�oso? "+apolo.getPreguicoso());
			apolo.locomocao();
			apolo.som();
		
		
		
	}
}
