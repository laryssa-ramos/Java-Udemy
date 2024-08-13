/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author Laryssa
 */
public class ChessSystem {

    public static void main(String[] args) {
       
        Board board = new Board(8, 8);
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
