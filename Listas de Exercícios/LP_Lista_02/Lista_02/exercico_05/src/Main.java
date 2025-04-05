import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double velKmH, velMs;

        System.out.print("Digite a velocidade em Km/h: ");
        Scanner in = new Scanner(System.in);
        velKmH = in.nextDouble();

        velMs = velKmH * 1000 / 3600;

        System.out.println("A velocidade em m/s é: " + velMs);
    }
}