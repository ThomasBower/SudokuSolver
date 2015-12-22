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
        return board[row];
    }

    public void setRow (int row, int[] vals) {
        System.arraycopy(vals, 0, board[row], 0, 9);
    }

    public int[] getCol (int col) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++)
            column[i] = board[i][col];
        return column;
    }

    public void setCol (int col, int[] vals) {
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

    private boolean isIn (int needle, int[] haystack) {
        for (int e : haystack) {
            if (e == needle)
                return true;
        }
        return false;
    }

    public boolean isInCol (int n, int col) {
        return isIn(n, getCol(col));
    }

    public boolean isInRow (int n, int row) {
        return isIn(n, getRow(row));
    }

    public boolean isInBox (int n, int x, int y) {
        return isIn(n, getBox(x, y));
    }

    public boolean isEmpty () {
        for (int i = 0; i < 9; i++) {
            for (int e : getRow(i)) {
                if (e < 10 && e > 0)
                    return false;
            }
        }
        return true;
    }

}