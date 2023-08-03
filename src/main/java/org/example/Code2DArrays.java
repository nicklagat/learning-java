package org.example;

import java.util.Arrays;

public class Code2DArrays {
    public static void main(String[] args) {
        // Tic Tac Toe
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = '0';
        board[0][1] = 'X';
        board[0][2] = '0';
        board[1][0] = 'X';
        board[1][1] = '0';
        board[1][2] = 'X';
        board[2][0] = '0';
        board[2][1] = 'X';
        board[2][2] = '0';
        System.out.println(Arrays.deepToString(board));

        // Declare and initialize a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // Print the elements of the 2D array
        for (int i = 0; i < matrix.length; i++) { // This iterates over the rows
            for (int j = 0; j < matrix[i].length; j++) { // This iterates over the columns of each row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Print a new line at the end of each row
        }

    }


}
