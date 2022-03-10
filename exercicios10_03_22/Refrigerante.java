package exercicios10_03_22;

public class Refrigerante extends Produto {

	public Refrigerante(String a, String b, String c, String d) {
		super(a, b, c, d);
	}

	@Override
	public void utilidade() {
		System.out.println("Este produto piora sua saúde!");
	}

}
