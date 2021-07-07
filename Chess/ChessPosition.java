package Chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valores inválidos");
        }
        this.column = column;
        this.row = row;
    }

    public char getCollumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

}