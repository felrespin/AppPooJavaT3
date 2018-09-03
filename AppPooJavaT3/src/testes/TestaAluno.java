package testes;

import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {

		final int ANO_ATUAL = 2018;
		
		String nomeM = "Maria";
		int idadeM = 39;
		float mensalidadeM = 500;
		boolean masculinoM = false;
		
		String nomeJ = "Joao";
		int idadeJ = 59;
		float mensalidadeJ = 2000;
		boolean masculinoJ = true;
	
				
				Scanner ler = new Scanner(System.in);
				
				String nome;
				System.out.printf("Informe o seu nome: ");		
				nome = ler.nextLine();		
				
				int matricula;
				System.out.printf("Informe a sua idade: ");		
				matricula = ler.nextInt();		
				
				float salario;
				System.out.printf("Informe o sua mensalidade: ");		
				salario = ler.nextFloat();		

				boolean masculino;
				System.out.printf("Você é do sexo masculino:  ");
				
				if (ler.next() == "sim") {
					masculino = true;					
				} else {
					masculino = false;
				}		
				
				//masculino = ler.nextBoolean();
				
				System.out.println("Nome: " + nome);
				System.out.println("Matrícula: " + matricula);
				System.out.println("Salário: " + salario);
				System.out.println("infnet " + (masculino ? "sim" : "não"));
		}
	}
