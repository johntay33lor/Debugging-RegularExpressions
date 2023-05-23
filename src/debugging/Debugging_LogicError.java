package debugging;

public class Debugging_LogicError {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        // Logic error
        average += 10; // Adding 10 to the average

        return average;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        double result = calculateAverage(array);

        System.out.println("The average is: " + result);
    }
}

//To fix using debugger place breakpoint on line 14.
//Inspect the variable to see what's causing the problem.
//Instead of adding 10 to average, change variable to 0.
