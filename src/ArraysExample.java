import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        System.out.println("Largest number: " + max);

        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
