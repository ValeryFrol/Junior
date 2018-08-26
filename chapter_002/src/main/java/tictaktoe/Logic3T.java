package tictaktoe;

public class Logic3T {

    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            int countV = 0;
            int countH = 0;
            for (int j = 0; j < this.table.length; j++) {
                if (table[i][j].hasMarkX() == false) countV = +1;
                if (table[i + j][i].hasMarkX() == false) countH = +1;
                if (countV == 3 || countH == 3) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            int countV = 0;
            int countH = 0;
            for (int j = 0; j < this.table.length; j++) {
                if (table[i][j].hasMarkO() == true) countV = +1;
                if (table[i + j][i].hasMarkO() == true) countH = +1;
                if (countV == 3 || countH == 3) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table.length; j++) {
                if (table[i][j].hasMarkO() != true && table[i][j].hasMarkX() != false) result = true;
            }
        }
        return result;
    }
}


