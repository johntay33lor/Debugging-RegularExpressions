package debugging;
public class Debugging_Exceptions {
    public static double getAverage (int[] nums) {
        int sum = 0;

        try {
            for (int i = 0; i <= nums.length; i++) { //ArrayIndexOutOfBoundsException added
                sum += nums[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Line 7");
        }

        double avg = (double) sum / nums.length;

        return avg;
    }

    public static void main(String[] args) {
        int[] array = null; //NullPointerException added
        double answer = getAverage(array);

        System.out.println("Average: " + answer) ;
    }
}

//To fix using debugger place breakpoint on the line with the loop.
//From there inspect the variables to identify the problem.
//Change back to i < nums.length.

//To fix using debugger place breakpoint on line 20.
//Provide a valid array instead of null.
//This will actually add items into the array.