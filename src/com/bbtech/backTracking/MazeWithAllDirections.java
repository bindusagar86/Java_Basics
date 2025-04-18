package com.bbtech.backTracking;

public class MazeWithAllDirections {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        findAllPath("", maze, 0, 0);
    }

    private static void findAllPath(String path, boolean[][] maze, int row, int col) {
        int rowLength = maze.length - 1;
        int colLength = maze[0].length - 1;
        if (row == rowLength && col == colLength) {
            System.out.println(path);
            return;
        }

        if (!maze[row][col]) {
            return;
        }
        //marking the visited cell, so that it can't be visited in the same function call
        maze[row][col] = false;

        //moving Down
        if (row < rowLength) {
            findAllPath(path + 'D', maze, row + 1, col);
        }
        //moving Right
        if (col < colLength) {
            findAllPath(path + 'R', maze, row, col + 1);
        }
        //moving Up
        if(row > 0) {
            findAllPath(path + 'U', maze, row - 1, col);
        }
        //moving Left
        if(col > 0) {
            findAllPath(path + 'L', maze, row, col - 1);
        }
        //restoring the maze as it's after function call is over, so that it'll not interfere
        //with other function calls
        maze[row][col] = true;
    }
}
