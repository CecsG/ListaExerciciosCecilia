import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double N1, N2, media;

        System.out.print("Digite a primeira nota: ");
        Scanner in = new Scanner(System.in);
        N1 = in.nextDouble();

        System.out.print("Digite a segunda nota: ");
        N2 = in.nextDouble();

        media = (N1 + N2) / 2;

        System.out.println("A média das notas é: " + media);
    }
}