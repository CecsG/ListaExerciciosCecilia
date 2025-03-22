import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius: ");

        Scanner in = new Scanner(System.in);
        celsius = in.nextDouble();

        fahrenheit = (celsius * 9/5) + 32; // Conversão para Fahrenheit
        System.out.println(celsius + " °C equivale a " + fahrenheit + " °F.");
    }
}