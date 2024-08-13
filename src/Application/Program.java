package Application;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

public class Program {
    public static void main (String[]args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
  