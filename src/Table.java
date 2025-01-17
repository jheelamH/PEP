import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int m = sc.nextInt();
//        boolean isPrime=true;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                isPrime=false;
//            }
//        }
//        if(isPrime){
//            System.out.println(n+" is a prime number");
//        }
//        else{
//            System.out.println(n+" is not a prime number");
//        }
//        for (int a = n; a <= m; a++) {
//            if (isArmstrong(a)) {
//                System.out.println(a);
//            }
//        }
//    }
//
//    public static boolean isArmstrong(int num) {
//        int original = num;
//        int sum = 0;
//        int digits = 0;
//        int temp = num;
//        while (temp > 0) {
//            digits++;
//            temp /= 10;
//        }
//        temp = num;
//        while (temp > 0) {
//            int digit = temp % 10; // Get the last digit
//            int power = 1;
//            for (int i = 0; i < digits; i++) {
//                power *= digit;
//            }
//
//            sum += power; // Add to the sum
//            temp /= 10;   // Remove the last digit
//        }
//
//        // Check if the sum equals the original number
//        return sum == original;
//

        int score=sc.nextInt();
        String grade;
        switch(score/10){
            case 10:
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default:
                grade="F";
        }
        System.out.println(grade);
    }
}
