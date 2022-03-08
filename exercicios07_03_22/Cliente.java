package exercicios07_03_22;

public class Cliente {
		/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
		//Atributos
		String nomeCompleto;
		String cpf;
		String dataNascimento;
		String email;
		String telefone;
		double preco;
		String dataCompra;
		
		//Métodos construtor
		public Cliente(String completname,String record, String birth, String contact1,
				String contact2, double price, String when) {
		this.nomeCompleto = completname;
		this.cpf=record;
		this.dataNascimento = birth;
		this.email = contact1;
		this.telefone = contact2;
		this.preco = price;
		this.dataCompra = when;
		}
		
		//Métodos
		public void estado() {
			System.out.println("Nome completo :"+this.nomeCompleto);
			System.out.println("CPF: "+this.cpf);
			System.out.println("Data de nascimento: "+this.dataNascimento);
			System.out.println("email: "+this.email);
			System.out.println("Telefone: "+this.telefone);
			System.out.println("Preço: "+this.preco);
			System.out.println("Data da compra: "+this.dataCompra);
		}	
		
		
				
}
