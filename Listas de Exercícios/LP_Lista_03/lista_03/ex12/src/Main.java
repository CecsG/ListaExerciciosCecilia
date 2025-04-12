import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros separados por espaço");

        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("-----------------------------" +
                           "MENU"+
                           "--------------------------------" +
                            "1.SOMA" +
                            "2.SUBTRAÇÃO" +
                            "3.MULTIPLICAÇÃO" +
                            "4.DIVISÃO" +
                            "-------------------------------" +
                            "Escolha uma opção: ");

        option = in.nextInt();

        switch (option){
            case 1:
                result = n1 + n2;
                System.out.println(n1 + "+" + n2 + "=" + result);

            case 2:
                result = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + result);

            case 3:
                result = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + result);

            case 4:
                result = n1 / n2;
                System.out.println(n1 + "/" + n2 + "=" + result);
        }
    }
}