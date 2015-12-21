package com.bower;

import java.util.Arrays;

public class Main {

    private static int[][] sudoku = {{5,3,0,0,7,8,9,1,2},
                                     {6,0,0,1,9,5,0,0,0},
                                     {0,9,8,0,0,0,0,6,0},
                                     {8,0,0,0,6,0,0,0,3},
                                     {4,0,0,8,0,3,0,0,1},
                                     {7,0,0,0,2,0,0,0,6},
                                     {0,6,0,0,0,0,2,8,0},
                                     {0,0,0,4,1,9,0,0,5},
                                     {0,0,0,0,8,0,0,7,9}};

    public static void main(String[] args) {
        //System.out.println("Enter a character:");

        Board board = new Board(sudoku);

        System.out.println(Arrays.toString(board.getRow(7)));
        System.out.println(Arrays.toString(board.getCol(7)));
        System.out.println(Arrays.toString(board.getBox(0,0)));

    }
}
