import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int space = 2 * N - 1;
        int star = 0;

        for (int i = 1; i <= N; i++) {
            space -= 2;
            star++;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        space = 1;
        star = N - 1;

        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            space += 2;
            star--;
            System.out.println();
        }
    }
}
