import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu número: ");
        int num = in.nextInt();

        int primeiro=0, segundo=1;

        System.out.println(primeiro + " " + segundo + " ");

        for(int i=2; i<num; i++){
            int next = primeiro + segundo;
            System.out.println(next + " ");
            primeiro = segundo;
            segundo = next;
        }

    }
}