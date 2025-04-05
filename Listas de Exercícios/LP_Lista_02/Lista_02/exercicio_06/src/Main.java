import java.util.Scanner;
public class Main{
    public static void main(String[]  args) {
        double velocidadeMs, velocidadeKmH;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em m/s: ");
        velocidadeMs = in.nextDouble();

        velocidadeKmH = velocidadeMs * 3.6;
        System.out.println("A velocidade em Km/h é: " + velocidadeKmH);
    }
}

