package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args)
    {
        int[][] twoDArray = new int[5][5];
        // use 2 for loops to populate the 2d array
        // first for loop
        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray[i].length; j++){
                twoDArray[j][i] = 3 + j*3 + 15*i;

                // 1*3 2*3 3*3 4*3 5*3
                // 6*3 7*3 8*3 9*3 10*3
                // 11*3 12 13 14 15
                // 16 17 18 19 20
                // 21 22 23 24 25
            }
        }

        for (int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray[i].length; j++){
                System.out.print(twoDArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
