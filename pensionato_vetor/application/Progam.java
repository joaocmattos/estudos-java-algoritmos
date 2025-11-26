package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante[] vect = new Estudante[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			Estudante estudante = new Estudante(name, email);

			vect[roomNumber] = estudante;

			sc.nextLine();

		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
			System.out.println(i + ": "+ vect[i]);
			}
			
		}

		sc.close();
	}

}
