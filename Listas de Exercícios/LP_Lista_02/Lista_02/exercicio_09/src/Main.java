import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double km, miles;

        System.out.println("Digite uma medida em quilômetros: ");

        Scanner in = new Scanner(System.in);
        km = in.nextDouble();

        miles = km * 0.621371; // Conversão para milhas
        System.out.println(km + " km equivale a " + miles + " milhas.");
    }
}
