package br.com.generations.list;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMercado {

	public static List<String> nomes = new ArrayList<String>();

	public static void main(String[] args) {

		//###ADICIONANDO NOMES A LISTA###
		nomes.add("Patricia"); 
		nomes.add("Paola"); 
		nomes.add("Paloma"); 
		nomes.add("Percy");
		nomes.add("Partucipe");		
		
		//###REMOVE TODOS OS ITENS DA LISTA###
		//nomes.clear();
		
		//###MOSTRAR ITEMS DA LISTA USANDO FOR EACH###
		ShowList();
		
		//###REMOVE NOME DA LISTA###
		nomes.remove(4); //removendo pelo indice
		
		//###ATUALIZA O NOME DA POSICAO###
		nomes.set(3, "Walter");

		System.out.println("---");
		ShowList();	
				
	}
	
	//###MOSTRAR ITEMS DA LISTA USANDO FOR EACH###
	public static void ShowList() {
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
	}

}
