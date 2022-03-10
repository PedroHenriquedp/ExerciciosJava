package exercicios10_03_22;

import java.util.ArrayList;

public class EstoqueLoja {
		
	public static void main(String[] args) {
		Refrigerante coca = new Refrigerante("Coca-Cola","165979","Bebidas","25/05/2022");
		Detergente ype = new Detergente("Detergente Ype","183211","Saniantes","03/06/2030");
		Carne friboi = new Carne("Carne Premium","90692","Alimentício","15/03/2022");
		ArrayList<String>produto = new ArrayList<>();
		
		ArrayList<String>cocaCola = new ArrayList<>();	
		
		//Coca
		cocaCola.add(coca.getNome());
		cocaCola.add(coca.getBarcode());
		cocaCola.add(coca.getCategoria());
		cocaCola.add(coca.getValidade());
		//Detergente
		ArrayList<String>saniante = new ArrayList<>();
		saniante.add(ype.getNome());
		saniante.add(ype.getBarcode());
		saniante.add(ype.getCategoria());
		saniante.add(ype.getValidade());
		//Carne
		ArrayList<String>carne = new ArrayList<>();
		carne.add(friboi.getNome());
		carne.add(friboi.getBarcode());
		carne.add(friboi.getCategoria());
		carne.add(friboi.getValidade());
		
		System.out.println("PRODUTOS:\n"+cocaCola+"\n"+saniante+"\n"+carne);
		System.out.println(cocaCola);
		
		
		
		
		//Organizando dentro de uma variável
		//Coca
		String nomeProduto1 =cocaCola.get(0);
		String barProduto1 = cocaCola.get(1);
		String catProduto1 = cocaCola.get(2);
		String dataProduto1 = cocaCola.get(3);
		
		//Detergente
		String nomeProduto2 =saniante.get(0);
		String barProduto2 = saniante.get(1);
		String catProduto2 = saniante.get(2);
		String dataProduto2 = saniante.get(3);
		
		//Carne
		String nomeProduto3 =carne.get(0);
		String barProduto3 = carne.get(1);
		String catProduto3 = carne.get(2);
		String dataProduto3 = carne.get(3);
		
		
		//Print Estoque
		System.out.println("Arrumando a pratilheira");
		System.out.println("|Produto: "+nomeProduto1+"| Código de barra: "+barProduto1+
				"| Categoria: "+catProduto1+"| Data de validade: "+dataProduto1);
		System.out.println("\n");
		System.out.println("|Produto: "+nomeProduto2+"| Código de barra: "+barProduto2+
				"| Categoria: "+catProduto2+"| Data de validade: "+dataProduto2);
		System.out.println("\n");
		System.out.println("|Produto: "+nomeProduto3+"| Código de barra: "+barProduto3+
				"| Categoria: "+catProduto3+"| Data de validade: "+dataProduto3);
		System.out.println("\n");
		System.out.println("Lista dos produtos");
		cocaCola.clear();
		System.out.println("--Compraram a Coca-cola--");
		System.out.println("PRODUTOS:\n"+cocaCola+"\n"+saniante+"\n"+carne);
		
	}
}
