import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2 , media;
        String n3;


        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextDouble();

         media = (n1 + n2) / 2;

        if (media >= 8.5) {
            n3 = "A";
        } else if (media >= 7) {
            n3 = "B";
        } else if (media >= 5) {
            n3 = "C";
        } else {
            n3 = "D";
        }

        System.out.println("A média é: " + media);
        System.out.println("O conceito é: " + n3);


    }
}
