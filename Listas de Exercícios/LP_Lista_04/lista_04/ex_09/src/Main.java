import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        char option;
        boolean erro = false;

        Scanner in = new Scanner(System.in);

        do{
            erro = false;
            for (int i=1; i<=10; i++){
                for (int j=0; j<=10; j++){
                    System.out.println(i + " x "+ j + " = ");
                    result = in.nextInt();
                    if (result != (i*j)){
                        erro = true;
                        System.out.println("Erro");
                        break;
                    }
                }
                if (erro)
                    break;
                System.out.println("-------------------------");

            }

            if (!erro)
                System.out.println("Você venceu");
            System.out.println("Jogar novamente? \nSim (S)\nNão (N)");
            option = in.next().charAt(0);

        }while(option == 's' || option=='S');
        System.out.println("Obrigado por jogar");
    }
}