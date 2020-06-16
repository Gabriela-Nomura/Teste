package br.com.teste.avaliacao;

import java.util.Scanner;

public class Media {

	private double number;
	private double sum;
	private int cont;
	private double average;

	public Media() {

	}

	public Double calculateClassAverage(Double averages, int nOfStudents) {
		Double classAverage = averages / nOfStudents;
		return classAverage;
	}

	public double calculateAverage(double n) {
		number = 0;
		sum = 0;
		for (cont = 1; cont <= n; cont = cont + 1) {
			System.out.println("Please insert the " + cont + "º number:");
			Scanner s = new Scanner(System.in);
			number = s.nextFloat();
			// Soma o valor inserido ao valor já armazenado.
			sum = sum + number;
		}
		return average = sum / n;
	}

}
