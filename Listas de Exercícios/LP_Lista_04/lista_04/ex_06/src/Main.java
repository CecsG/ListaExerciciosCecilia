import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        if(n1<n2) {
            for(int i=n1+1; i<n2; i++)
                System.out.println(i);
        }

        else if(n1>n2) {
            for(int i=n2-1; i<n1; i++)
                System.out.println(i);
        }

        else
            System.out.println("Os números são iguais");

    }
}