import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x, x1, x2;
        System.out.print("Digite o coeficiente a: ");
         a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
         b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
         c = scanner.nextDouble();

         delta = b * b - 4 * a * c;

        if (delta > 0) {
             x1 = (-b + Math.sqrt(delta)) / (2 * a);
             x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
             x = -b / (2 * a);
            System.out.println("A equação tem uma única raiz real: x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }

    }
}
