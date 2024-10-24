package Chess.pieces;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessPiece;
import Chess.Color;

public class Queen extends ChessPiece {

    public Queen (Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "Q";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
        //acima
        p.setValues(position.getRow() -1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        //esquerda
        p.setValues(position.getRow() , position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        //direita

        p.setValues(position.getRow() , position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        //a baixo
        p.setValues(position.getRow() +1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }
        //diagonal esquerda superior
        p.setValues(position.getRow() -1, position.getColumn() -1);
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()-1,p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        //diagonal direita superior
        p.setValues(position.getRow() - 1 , position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()-1, p.getColumn() +1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        //diagonal direita inferior

        p.setValues(position.getRow() +1 , position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()+1,p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        //a diagonal esquerda inferior
        p.setValues(position.getRow() +1, position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().therIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()+1,p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;

        }

        return mat;
    }
}
