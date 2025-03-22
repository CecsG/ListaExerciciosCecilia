public class Main {
    public static void main(String[] args) {
        double miles, km;

        System.out.println("Digite uma medida em milhas: ");

        Scanner in = new Scanner(System.in);
        miles = in.nextDouble();

        km = miles / 0.621371; // Conversão para quilômetros
        System.out.println(miles + " milhas equivale a " + km + " km.");
    }
}