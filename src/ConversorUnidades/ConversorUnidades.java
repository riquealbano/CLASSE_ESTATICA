package ConversorUnidades;

public class ConversorUnidades {

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter quilômetros para milhas
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371; // 1 km = 0.621371 milhas
    }

    // Método para converter gramas para libras
    public static double gramasParaLibras(double gramas) {
        return gramas * 0.00220462; // 1 grama = 0.00220462 libras
    }
}
