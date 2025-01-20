import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a=sc.nextLine();
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        int n=a.length();
        String reverse="";
        for(int i=n-1;i>=0;i--){
            reverse += a.charAt(i);
        }
        System.out.println(reverse);
        boolean isPalindrome=true;
        for(int i=0;i<=n/2;i++){
            if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(a.charAt(a.length() - 1 - i))){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
    }
}
