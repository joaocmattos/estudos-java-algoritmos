package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Progam {

	public static void main(String[] args) {
		/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
		no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
		os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
		igual a 6.0 (seis).*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Alunos[] vect = new Alunos[n];
		
		for(int i=0;i<n;i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do "+(i +1)+ "o aluno: ");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Alunos(nome, nota1, nota2);
		}
		
		
		System.out.println("Alunos aprovados: ");
		for(int i=0;i<n;i++) {
			if( vect[i].calcularMedia()>= 6) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

}
}