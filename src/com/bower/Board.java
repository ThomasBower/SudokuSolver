package com.bower;

/**
 * Created by Thomas on 21/12/2015.
 */
public class Board {

    private int[][] board = new int[9][9];

    public Board (int[][] board) {
        this.board = board;
    }

    public int[] getRow (int row) {
        if (row < 0 || row > 8)
            throw new IllegalArgumentException("Invalid row number supplied.");

        return board[row];
    }

    public void setRow (int row, int[] vals) {
        if (row < 0 || row > 8)
            throw new IllegalArgumentException("Invalid row number supplied.");

        System.arraycopy(vals, 0, board[row], 0, 9);
    }

    public int[] getCol (int col) {
        if (col < 0 || col > 8)
            throw new IllegalArgumentException("Invalid column number supplied.");

        int[] column = new int[9];
        for (int i = 0; i < 9; i++)
            column[i] = board[i][col];
        return column;
    }

    public void setCol (int col, int[] vals) {
        if (col < 0 || col > 8)
            throw new IllegalArgumentException("Invalid column number supplied.");

        for (int i = 0; i < 9; i++)
            board[i][col] = vals[i];
    }

    public int[] getBox (int x, int y) {
        int[] box = new int[9];
        for (int j = y * 3, cnt = 0; j < (y + 1) * 3; j++) {
            for (int i = x * 3; i < (x + 1) * 3; i++, cnt++) {
                box[cnt] = board[j][i];
            }
        }
        return box;
    }
}