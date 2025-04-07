package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Informe a base do triangulo: ");
		Double base = sc.nextDouble();
		System.out.print("Informe a altura do triangulo: ");
		Double altura = sc.nextDouble();
		sc.close();

		Triangulo triangulo = new Triangulo(base, altura);

		double area = triangulo.area();

		System.out.println("A area do triangulo é: " + String.format("%.2f", area));

	}

}
