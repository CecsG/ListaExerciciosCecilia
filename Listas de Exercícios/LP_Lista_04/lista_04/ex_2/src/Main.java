import java.util.Scanner; // Importa a ferramenta para ler o que o usuário digita

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Cria o leitor do teclado

        int maior = 0;
        int menor = 0;

        System.out.print("Digite o 1º número: ");
        int numero = teclado.nextInt();
        maior = numero;
        menor = numero;


        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = teclado.nextInt();

            if (numero > maior) {
                maior = numero;
            }if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

    }
}
