package com.bbtech.backTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(findPath("", maze, 0, 0, new ArrayList<>()));
    }

    private static List<String > findPath(String path, boolean[][] maze,
                                          int row, int col, ArrayList<String> results) {
        int rowLength = maze.length - 1;
        int colLength = maze[0].length - 1;

        if (row == rowLength && col == colLength) {
            results.add(path);
            return results;
        }
        //if path contains obstacles return the results
        if (!maze[row][col]) {
            return results;
        }

        if (row < rowLength) {
            findPath(path + 'V', maze, row + 1, col, results);
        }

        if (col < colLength) {
            findPath(path + 'H', maze, row, col + 1, results);
        }
        return results;
    }
}
