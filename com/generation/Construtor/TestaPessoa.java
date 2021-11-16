package br.com.generation.Construtor;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String n = s.next();
		System.out.println("Digite sua idade: ");
		int i = s.nextInt();
		//String n = "Antonio";
		//int i = 22;
		Pessoa pessoa1 = new Pessoa(n, i);
		
		System.out.println("nome: " + pessoa1.nome);
		System.out.println("idade: " + pessoa1.idade);

		s.close();
	}

}
