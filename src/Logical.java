import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean n = sc.nextBoolean();
        boolean m = sc.nextBoolean();
        boolean and = n && m;
        boolean or = n || m;
        boolean notn = !n;
        boolean notm = !m;
        System.out.println("Logical AND: " + and);
        System.out.println("Logical OR: " + or);
        System.out.println("Logical NOT for n: " + notn);
        System.out.println("Logical NOT for m: " + notm);
    }
}
