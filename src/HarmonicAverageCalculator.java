public class HarmonicAverageCalculator {

    public static void main(String[] args){
        System.out.println("Welcome to array challenges.");

        double[] numbers = {100, 120};

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1 / numbers[i]  ;
        }

        System.out.println(numbers.length / sum);


    }

}
