import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int [] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        boolean encontrado = false;

        for (int i=0; i<vetor.length; i++) {
            if (vetor[i] == num) {
                System.out.println("Valor encontrado na posição " + i + " do vetor.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado");
        }
    }

}