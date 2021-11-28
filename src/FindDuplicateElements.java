import java.util.*;
public class FindDuplicateElements {

    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 3, 4, 6, 1, 6, 9, 11, 11, 3, 8, 12, 8};
        int[] duplicates = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++){
                if ((i != j) && ((list[i] % 2) == 0) && (list[i] == list[j])){
                    if (!isFind(duplicates, list[i])){
                        duplicates[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("Array is : " + Arrays.toString(duplicates));
        System.out.println("Duplicates even numbers are : ");
        for (int value : duplicates){
            if (value != 0){
                System.out.println(value);
            }
        }

    }
}
