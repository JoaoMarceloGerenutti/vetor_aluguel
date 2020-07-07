package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos vão ser alugados? ");
		int quantidadeQuartos = sc.nextInt();
		
		Rent[] vetor = new Rent[10];
		
		for (int i=0; i<quantidadeQuartos; i++) {
			sc.nextLine();
			System.out.println();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Rent(nome, email, quarto);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}

}
