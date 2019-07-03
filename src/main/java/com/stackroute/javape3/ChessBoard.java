package com.stackroute.javape3;

public class ChessBoard {
    public String chessBoard()
    {
        String[][] board = new String[8][8];
        String msg1="",msg2="";

        for (int outer_index = 0; outer_index < 8; outer_index++) {
            for (int inner_index = 0; inner_index < 8; inner_index++) {
                board[outer_index][inner_index] = (outer_index + inner_index) % 2 == 0 ? "WW" : "BB";//Checking whether to place black or white
            }
        }
          msg1="My Chess Board:\n";
        for (int outer_index = 0; outer_index < 8; outer_index++) {
            for (int inner_index = 0; inner_index < 8; inner_index++) {
                msg2= msg2+board[outer_index][inner_index]  +"|";
            }
            msg2=msg2+"\n";
        }
        return msg1+msg2;//returning the chessboard
    }
}
