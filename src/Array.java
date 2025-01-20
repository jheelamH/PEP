import java.util.Scanner;
public class Array {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] a = new int[n][n];
//        for(int i=0;i<n;i++){
//            a[i]=in.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            System.out.println("Element at index "+i+" is "+a[i]);
//        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//              System.out.println("Element at index a["+i+"]["+j+"] is "+a[i][j]);
//            }
            System.out.println("max element in the array is "+max_Array(a,n));
            System.out.println("min element in the array is "+min_Array(a,n));
        }


        public static int min_Array(int[][] a,int n) {
            int min=a[0][0];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j]<min){
                        min=a[i][j];
                    }
                }
            }
            return min;
        }
        public static int max_Array(int[][] a,int n) {
            int max=a[0][0];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j]>max){
                        max=a[i][j];
                    }
                }
            }
            return max;
        }
    }

