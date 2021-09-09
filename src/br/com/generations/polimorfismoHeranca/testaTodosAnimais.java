package br.com.generations.polimorfismoHeranca;

public class testaTodosAnimais {

	public static void main(String[] args) {

		Cavalo cavalinho = new Cavalo();
		Cachorro auau = new Cachorro();
		Preguica soneca = new Preguica();

		auau.EmitirSom("Au AU!");
		cavalinho.EmitirSom("ihuuuu!");
		soneca.EmitirSom("zzzZZZZ");

	}

}
