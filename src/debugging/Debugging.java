package debugging;

public class Debugging {
    public static double getAverage (int[] nums) {
        int sum = 0;

        //Loop through array to get each number
        for (int num : nums) {
            sum += num;
        }

        //Average is sum divided by number of items
        double avg = (double) sum / nums.length;

        return avg;
    }

    public static void main(String[] args) {
        //Test that method works
        int[] array = {1,2,3,4,5};
        double answer = getAverage(array);
        System.out.println("Average: " + answer);
    }
}
