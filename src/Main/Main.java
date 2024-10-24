package Main;

import ConversorUnidades.ConversorUnidades;

public class Main {
	public static void main(String[]args) {
		double temperatura = ConversorUnidades.celsiusParaFahrenheit(25);
		System.out.println("A temperatura dada em celsius, em Fahrenheit se da exatamente á: " + temperatura + "\n");
		
		double distancia = ConversorUnidades.quilometrosParaMilhas(50);
		System.out.println("A distancia dada em quilometros, em milhas é: " + distancia + "\n");

		double peso = ConversorUnidades.gramasParaLibras(83000);
		System.out.println("O peso dado em gramas, em libras pesa: " + peso + "\n");

	}
}
