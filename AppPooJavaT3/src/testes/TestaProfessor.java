package testes;

import java.util.Scanner;

public class TestaProfessor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		System.out.printf("Informe o seu nome: ");		
		nome = ler.nextLine();		
		
		int matricula;
		System.out.printf("Informe a sua matr�cula: ");		
		matricula = ler.nextInt();		
		
		float salario;
		System.out.printf("Informe o seu sal�rio: ");		
		salario = ler.nextFloat();		

		boolean temporario;
		System.out.printf("Informe se � um professor tempor�rio: ");		
		temporario = ler.nextBoolean();
				
		int experiencia;
		System.out.printf("Informe seu tempo de experi�ncia: ");		
		experiencia = ler.nextInt();
		
		float bonus;
		System.out.printf("Informe o seu bonus por trabalho: ");		
		bonus = ler.nextFloat();		

		float  gratificacao;
		System.out.printf("Informe a sua gratifica��o: ");		
		gratificacao = ler.nextFloat();		
		
		float  desconto;
		System.out.printf("Informe a quantidade de desconto: ");		
		desconto = ler.nextFloat();	
		
		int numeroDisciplinas;
		System.out.printf("Informe a quantidade de disciplinas: ");		
		numeroDisciplinas = ler.nextInt();
		
		float salarioBruto = 0;
		final float VL_EXPERIENCIA = 50;
		final float VL_DISCIPLINA = 100;
				 
		salarioBruto = (salario + bonus + gratificacao - desconto);
		salarioBruto = salarioBruto + (experiencia * VL_EXPERIENCIA );
		salarioBruto = salarioBruto + (numeroDisciplinas * VL_DISCIPLINA);
		
		System.out.println("Nome: " + nome);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Tempor�rio? " + (temporario ? "sim" : "n�o"));
//		System.out.printf("O sal�rio bruto � R$%.2f", salarioBruto) ;
		System.out.printf("O professor %s (%d)  � %s, pois ganha R$%.2f",
				nome, 
				matricula,
				(salarioBruto >= 10000 ? "rico" : "pobre"),
				salarioBruto);
	}
}
