import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
//        int columns=sc.nextInt();
        for (int i = 1; i <= rows; i++){
//            if(i%2!=0){
//                System.out.print(" ");
//            }
            for (int j = i; j <rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
