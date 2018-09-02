package tictaktoe;

public class Logic3T {

    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        for (int j = 0; j < this.table.length; j++) {
            int countV = 0;
            for (int i = 0; i < this.table.length; i++) {
                if (table[i][j].hasMarkX() == true) countV = countV + 1;
                if (countV == 3) return true;
            }
        }
        for (int i = 0; i < this.table.length; i++) {
            int countH = 0;
            for (int j = 0; j < this.table.length; j++) {
                if (table[i][j].hasMarkX() == true) countH = countH + 1;
                if (countH == 3) return true;
            }
        }
        return false;
    }

    public boolean isWinnerO() {
       for (int j = 0; j < this.table.length; j++) {
            int countV = 0;
            for (int i = 0; i < this.table.length; i++) {
                if (table[i][j].hasMarkO() == true) countV = countV + 1;
                if (countV == 3) return true;
            }
        }
        for (int i = 0; i < this.table.length; i++) {
            int countH = 0;
            for (int j = 0; j < this.table.length; j++) {
                if (table[i][j].hasMarkO() == true) countH = countH + 1;
                if (countH == 3) return true;
            }
        }
        return false;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table.length; j++) {
                if (table[i][j].hasMarkO() != true && table[i][j].hasMarkX() != true) result = true;
            }
        }
        return result;
    }
}

