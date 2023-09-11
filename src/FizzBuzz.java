/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int j = 1;
        while (j < 100){

            // Find out which numbers divide i.
            j = dofizzbuzz(j);
        }
    }

    private static int dofizzbuzz(int j) {
        boolean divisibleBy3 = j % 3 == 0;
        boolean divisibleBy5 = j % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(j);

        }
        j++;
        return j;
    }
}
