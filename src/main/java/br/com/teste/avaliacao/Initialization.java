package br.com.teste.avaliacao;

import java.util.Scanner;

public class Initialization {

	private int n;
	private Scanner s;
	private Double notaSub;
	private Double notaTest;
	private Double notaLabWork;
	public Media media;
	private Double studantAverage;

	public Initialization() {
		s = new Scanner(System.in);
		media = new Media();

	}

	public int numberOfStudants() {
		System.out.print("How many Studants are you going to input the grade?");
		n = s.nextInt();
		while (n <= 0) {
			System.out.println(
					"'" + n + "' The number provided is equal or lower than ZERO, please provide a higher value: ");
			// Atribui o valor fornecido a variavel n
			n = s.nextInt();
		}
		return n;
	}

	public double numberOfInput() {

		System.out.print("How many number are you going to input?");
		// instanciando a classe que fará a leitura do número fornecido no console
		n = s.nextInt();
		while (n <= 0) {
			System.out.println(
					"'" + n + "' The number provided is equal or lower than ZERO, please provide a higher value: ");
			// Atribui o valor fornecido a variavel n
			n = s.nextInt();
		}
		System.out.print(" Please insert the " + n + " grades.");
		return n;
	}

	public Double setAverages() {
		System.out.println("Enter the type of score your are going to insert, please: "
				+ "\n 1 - Submission of Assignments " + "\n 2 - Test " + "\n 3 - Lab-Works");
		n = s.nextInt();
		while (n < 1 || n > 3) {
			System.out.println("The value inserted is not a valid option, please try again: ");
			System.out.println("Enter the type of score your are going to insert, please: "
					+ "\n 1 - Submission of Assignments " + "\n 2 - Test " + "\n 3 - Lab-Works");
			// Atribui o valor fornecido a variavel n
			n = s.nextInt();
			if (n == 1) {

				System.out.println("The submission of Assignments average will be calculated");
				notaSub = media.calculateAverage(numberOfInput());
				return notaSub;
			} else if (n == 2) {
				System.out.println("The Test average will be calculated");
				notaTest = media.calculateAverage(numberOfInput());
				return notaTest;
			} else {
				System.out.println("The LabWork average will be calculated");
				notaLabWork = media.calculateAverage(numberOfInput());
				return notaLabWork;
			}

		}
		return studantAverage = ((10 / 100) * notaSub) + ((70 / 100) * notaTest) + ((20 / 100) * notaLabWork);

	}
}