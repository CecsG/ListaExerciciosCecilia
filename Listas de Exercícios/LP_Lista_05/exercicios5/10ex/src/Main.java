public class Main {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2},
                {2, 1},
                {3, 4}}; //matriz 3x2

        int[][] matriz2 = {{4, 3},
                {5, 6}}; //matriz 2x2

        int[][] results = new int[3][2];

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                for (int k=0; k<2; k++) {
                    results[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j=0; j<2; j++) {
                System.out.print("\n" + i + ", " + j + " = " + results[i][j] + " ");
            }
        }

    }
}