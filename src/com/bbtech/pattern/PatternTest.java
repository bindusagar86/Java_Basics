package com.bbtech.pattern;

/*
    Print the below pattern:
    -----------------------
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
 */
public class PatternTest {
    public static void main(String[] args) {
        printPattern(4);
    }

    private static void printPattern(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
