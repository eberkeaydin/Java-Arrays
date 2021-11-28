import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print((i+1) + ". element is : ");
            int index = scanner.nextInt();
            arr[i] = index;
        }
        Arrays.sort(arr);

        System.out.println("After sorting, array is : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
