import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        System.out.println("O quadrado do número digitado é: " + (number * number));
    }
}