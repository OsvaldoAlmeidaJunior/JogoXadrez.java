package BoardGame;

public class Board {
    private int rows;
    private int columns;
    private Piece [][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Erro na criação do tabuleiro:precisa que no minimo haja uma linha e uma coluna");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece [rows] [columns];

    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if(!positionExists(row,column)){
            throw new BoardException("A posição não esta no tabuleiro");
        }
        return pieces [row] [column];
    }
    public Piece piece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("A posição não esta no tabuleiro");
        }
        return pieces [position.getRow()] [position.getColumn()];
    }
    public void placePiece (Piece piece,Position position){
        if(therIsAPiece(position)){
            throw new BoardException("Já existe uma peça nessa posição " + position);
        }
        pieces[position.getRow()][position.getColumn()]=piece;
        piece.position = position;
    }
    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("A posição não esta no tabuleiro");
        }
        if (piece(position)==null){
            return null;
        }
        Piece aux = piece(position);
        aux.position=null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }
    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(),position.getColumn());
    }
    public boolean therIsAPiece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("A posição não esta no tabuleiro");
        }
        return piece(position)!=null;

    }
}
