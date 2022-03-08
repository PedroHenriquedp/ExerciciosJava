package exercicios07_03_22;

public class Loja {

		public static void main(String[] args) {
			/*Crie uma classe cliente e apresente os atributos e métodos referentes
			esta classe, em seguida crie um objeto cliente, defina as instancias deste
			objeto e apresente as informações deste objeto no console.*/
			Cliente c1 = new Cliente(null, null, null, null, null, 0, null);
			c1.nomeCompleto = "Joaquim Pereira";
			c1.cpf ="30255568292";
			c1.dataNascimento = "27_03_1988";
			c1.email = "joaquimp@gmail.com";
			c1.telefone = "973639865";
			c1.preco = 140.0;
			c1.dataCompra = "24_03_2022";
			
			c1.estado();
			
			
			
			
			
			
			
			
			
		}
}
