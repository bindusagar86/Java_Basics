package com.bbtech.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println("count: "+ count(3, 3));
        path("", 3, 3);
        System.out.println("Paths: "+ retrievePath("", 3, 3, new ArrayList<>()));
        System.out.println("Paths: "+ retrievePathWithDiagonal("", 3, 3, new ArrayList<>()));
    }

    private static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    private static void path(String result, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(result);
            return;
        }

        if(row > 1) {
            path(result + 'D', row - 1, col);
        }

        if (col > 1) {
            path(result + 'R', row, col - 1);
        }
    }

    private static List<String> retrievePath(String result, int row, int col, List<String> paths) {
        if (row == 1 && col == 1) {
            paths.add(result);
            return paths;
        }

        if(row > 1) {
            retrievePath(result + 'D', row - 1, col, paths);
        }

        if (col > 1) {
            retrievePath(result + 'R', row, col - 1, paths);
        }
        return paths;
    }

    private static List<String> retrievePathWithDiagonal(String result, int row, int col, List<String> paths) {
        //base condition, when row and column becomes 1 we found the result
        if (row == 1 && col == 1) {
            paths.add(result);
            return paths;
        }
        //since moving diagonally once row and column should be greater than 1, until we find the result
        if(row > 1 && col > 1) {
            retrievePathWithDiagonal(result + 'D', row - 1, col - 1, paths);
        }
        //since moving vertically, row should be greater than 1
        if(row > 1) {
            retrievePathWithDiagonal(result + 'V', row - 1, col, paths);
        }
        //since moving horizontally, column should be greater than 1
        if (col > 1) {
            retrievePathWithDiagonal(result + 'H', row, col - 1, paths);
        }
        return paths;
    }
}
