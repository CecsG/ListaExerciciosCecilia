import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number;

        System.out.println("Digite um número real: ");
        Scanner in = new Scanner(System.in);
        number = in.nextDouble();

        System.out.println("A quinta parte do número é: " + (number / 5));
    }
}