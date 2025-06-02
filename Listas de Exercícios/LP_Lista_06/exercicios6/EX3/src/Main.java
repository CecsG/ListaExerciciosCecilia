import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = in.nextInt();

        do{
            System.out.println("Enter Y: ");
            y = in.nextInt();
        }
        while (y<0);
        System.out.println(x + "^" + y + " = " + powerNumber(x, y));
    }


    public static int powerNumber (int x, int y) {
        if (y==0) //caso expoente seja zero
            return 1;

        int result = x;
        for (; y>1; y--) {
            result *= x; //result = resultado * x
        }
        return result;
    }
}