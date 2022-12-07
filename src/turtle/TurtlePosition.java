package turtle;

public class TurtlePosition {
    private int row = 0;
    private int column = 0;

    public TurtlePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object obj){
        boolean isEquals = false;
        TurtlePosition comparedPosition = (TurtlePosition) obj;
        boolean rowsAreEqual = comparedPosition.row == this.row;
        boolean columnsAreEqual = comparedPosition.column == this.column;
        return rowsAreEqual && columnsAreEqual;
    }

}

