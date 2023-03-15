package aula2;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite sua primeira  nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media;
		media = (nota1 + nota2)/2;
		
		System.out.println("nome: "+ nome);
		System.out.println("media: "+  media);

	}

}
