package aula01;
//   https://docs.google.com/document/d/1NCPyYu-0TJx-x-m_enyc2yiP1RtOCq_-TSypm4qaJH4/edit

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperaturaCelsius;
        System.out.println("Digite a temperatura em graus celsius:");
        temperaturaCelsius = scanner.nextDouble();
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        double temperaturaRankine = temperaturaFahrenheit + 459.67;
        double temperaturaReaumur = temperaturaCelsius * 0.8;
        System.out.printf("Temperatura convertida: %.2f °K; %.2f °F; %.2f °R; %.2f °Re \n", temperaturaKelvin,temperaturaFahrenheit, temperaturaRankine, temperaturaReaumur);

    }
}
