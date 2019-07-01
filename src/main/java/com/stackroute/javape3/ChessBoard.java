package com.stackroute.javape3;

public class ChessBoard {
    public String chessBoard()
    {
        String[][] board = new String[8][8];
        String msg1="",msg2="",msg3="";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = (i + j) % 2 == 0 ? "WW" : "BB";
            }
        }
          msg1="My Chess Board:\n";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                msg2= msg2+board[i][j]  +"|";
            }
            msg2=msg2+"\n";
        }
        return msg1+msg2;
    }
}
