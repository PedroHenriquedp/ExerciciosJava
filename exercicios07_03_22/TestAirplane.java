package exercicios07_03_22;

public class TestAirplane {
		public static void main(String[] args) {
		
			Airplane nave1 = new Airplane("FAB","KC-390 Millennium","Verde",100);
			Airplane nave2 = new Airplane("GOL", "G2020","Branco",89);
			Airplane nave3 = new Airplane("Latam","L2017","Azul",90);
			
			System.out.println("\n----Avião 1----\n");
			//Componentes para viajar nave 1
			nave1.comChave();
			nave1.comPessoas();
			nave1.comChave();
			nave1.tanque();
			nave1.ligar();
			//Resultado 1
			nave1.estilo();
			
			System.out.println("\n----Avião 2----\n");
			//Componentes para viajar nave 2
			nave2.comPessoas();
			nave2.comChave();
			nave2.tanque();
			nave2.ligar();
			//Resultado 2
			nave2.estilo();
			System.out.println("\n----Avião 3----\n");
			//Componentes para viajar nave 3
			nave3.comChave();
			nave3.tanque();
			nave3.ligar();
			//Resultado 3
			nave3.estilo();
			
			
			
			
			
		}
}
