/**
 * Program to demonstrate iterating two dimensional array using enhanced for
 * loop
 */
public class TwoDimensionalArrayEnhancedForLoop {
    public static void main(String[] args) {
        int[][] contents = { { 1, 2, 9 }, { 1, 9, 8, 8, 7 }, { 0 }, { 0 }, { 0 } };

        System.out.println("Loop Using Enhanced for loop:");
        for (int[] eachRow : contents) {
            for (int j : eachRow) {
                System.out.print(j + "\t");
            }
            System.out.println("\n");
        }
    }
}