package exercicios09_03_22;

public abstract class Animal {

	
	//Attributes
		private String nome;
		private int idade;
		private boolean preguicoso;
		
		
		//Method
		public void som() {
			System.out.println("Insira um som aqui");
		}
		public void locomocao() {
			System.out.println("Deve andar, correr, subir em árvore e etc... ");
		}
		
		//Advisors Method (Getters and Setters)
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public boolean getPreguicoso() {
			return preguicoso;
		}
		public void setPreguicoso(boolean preguicoso) {
			this.preguicoso = preguicoso;
		}

}
