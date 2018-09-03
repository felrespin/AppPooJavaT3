package testes;

import java.util.Scanner;

public class TestaProfessor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Testa
		String nome;
		System.out.printf("Informe o seu nome: ");		
		nome = ler.nextLine();		
		
		int matricula;
		System.out.printf("Informe a sua matrícula: ");		
		matricula = ler.nextInt();		
		
		float salario;
		System.out.printf("Informe o seu salário: ");		
		salario = ler.nextFloat();		

		boolean temporario;
		System.out.printf("Informe se é um professor temporário: ");		
		temporario = ler.nextBoolean();
				
		int experiencia;
		System.out.printf("Informe seu tempo de experiência: ");		
		experiencia = ler.nextInt();
		
		float bonus;
		System.out.printf("Informe o seu bonus por trabalho: ");		
		bonus = ler.nextFloat();		

		float  gratificacao;
		System.out.printf("Informe a sua gratificação: ");		
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
		System.out.println("Matrícula: " + matricula);
		System.out.println("Salário: " + salario);
		System.out.println("Temporário? " + (temporario ? "sim" : "não"));
//		System.out.printf("O salário bruto é R$%.2f", salarioBruto) ;
		System.out.printf("O professor %s (%d)  é %s, pois ganha R$%.2f",
				nome, 
				matricula,
				(salarioBruto >= 10000 ? "rico" : "pobre"),
				salarioBruto);
	}
}
