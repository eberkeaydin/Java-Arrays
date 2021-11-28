public class FrequencyOfElements {

    static boolean isRepeated(int[] array, int number) { //Method that finds repeated numbers.
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] duplicates = new int[list.length];
        int numberOfRepeating = 0;

        for (int i = 0; i < list.length; i++){

            for (int k : list) {
                if (list[i] == k) {
                    numberOfRepeating++;
                }
            }
            if (numberOfRepeating > 0){
                if (!isRepeated(duplicates, list[i])){
                    System.out.println(list[i] + " is repeated " + numberOfRepeating + " times.");
                    duplicates[i] = list[i];
                }
                numberOfRepeating = 0;
            }
        }


        }
    }
