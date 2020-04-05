package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04
{
    public static void main(String[] args)
    {
        int[][] irrArr = { {2, 4, 6}, {8, 10},{1, 0, 11, 12} };

        for(int[] outer : irrArr){
            for(int val : outer){
                System.out.print(val + " ");
            }
        }

    }


}
