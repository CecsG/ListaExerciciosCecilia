public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 8, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}};

        for (int i=0; i<matriz.length; i++) {
            System.out.println(matriz[i][4-i]);
        }
    }
}