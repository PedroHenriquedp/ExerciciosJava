package exercicios09_03_22;

public class Cavalo extends Animal {
		
		//Over ride
		@Override
		public void som() {
			System.out.println("Clip-Clop,Clip-Clop,Clip-Clop");
		}
		public void locomocao() {
			System.out.println("Deve correr");
		}
	
}
