import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha uma opção:");
            System.out.println("5 - Saldo");
            System.out.println("6 - Saque");
            System.out.println("7 - Depósito");
            System.out.println("8 - Transferência");
            System.out.println("9 - Sair");

            System.out.print("Digite um número entre as opções: ");
            int opcao = scanner.nextInt();

            if (opcao >= 5 && opcao <= 9) {
                System.out.println("Você escolheu a opção: " + opcao);
            } else {
                System.out.println("Opção inválida! Por favor, escolha um número entre 5 e 9.");
            }

        }
    }
