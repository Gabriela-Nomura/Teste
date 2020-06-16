package br.com.teste.runner;

import java.util.Scanner;

import br.com.teste.avaliacao.Initialization;
import br.com.teste.avaliacao.Media;

public class Application {

	public static Initialization initialization;
	private static Scanner s;
	public static Media media;

	public static void main(String[] args) {
		initialization = new Initialization();
		media = new Media();

		double classSum = 0;

		int numberOfStudants = initialization.numberOfStudants();
		for (int contador = 0; contador < numberOfStudants; contador++) {
			initialization.setAverages();
			double studantScore = initialization.setAverages();
			classSum = classSum + studantScore;

		}

		double classAverage = classSum / numberOfStudants;
		System.out.println("The class average is: " + classAverage);
	}

}
