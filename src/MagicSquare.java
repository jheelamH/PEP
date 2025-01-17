public class MagicSquare {
    public static void main(String[] args) {
        int n = 3;
        int[][] magicSquare = new int[n][n];
        int i = n / 2;
        int j = n - 1;
        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (i < 0) i = n - 1;
                if (j == n) j = 0;
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                magicSquare[i][j] = num++;
            }
            i--;
            j++;
        }

        System.out.println("3x3 Magic Square:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(magicSquare[row][col] + " ");
            }
            System.out.println();
        }
    }
}
