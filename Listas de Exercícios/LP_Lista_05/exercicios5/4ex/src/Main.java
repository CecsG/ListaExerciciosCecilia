import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] num = new int[10];
        int positionMin = 0, positionMax = 0;

        Scanner in = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Digite um número para a posição " + i + ": ");
            num [i] = in.nextInt();
        }

        int min = num [0];
        int max = num [0];

        for (int i=0; i<10; i++) {
            if (num [i] >= max) {
                max = num [i];
                positionMax = i;
            } else if (num [i] <= min) {
                min = num [i];
                positionMin = i;
            }
        }

        System.out.println("\nO maior núemro é " + max + ", equivalente a " + positionMax + "º posição");
        System.out.println("O menor número é " + min + ", equivalente a " + positionMin + "º posição");
    }
}