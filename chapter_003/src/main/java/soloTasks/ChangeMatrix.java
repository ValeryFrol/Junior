package soloTasks;

public class ChangeMatrix {


    public static String[][] changeOrder(String[][] array) {
        int roadNumber = 0, numberOfSteps = 1, turnIndex = 0, column = 0, row = 0;
        String[] direction = {"right", "down", "left", "up"};
        int height = array.length;
        int widthOfMatrix = array[0].length;
        int elementsLeft = height * widthOfMatrix;
        String[][] changedMatrix = new String[height][widthOfMatrix];
        int numberOfRoads = widthOfMatrix * 2 - 1;
        int[] roads = new int[numberOfRoads];
        for (int i = 0; i < numberOfRoads; i++) {
            roads[i] = (int) Math.floor(widthOfMatrix - (double) i / 2);
        }
        while (elementsLeft > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    changedMatrix[row][column] = array[i][j];
                    if (numberOfSteps == roads[roadNumber]) {
                        roadNumber += 1;
                        numberOfSteps = 0;
                        turnIndex += 1;
                        if (turnIndex == 4) turnIndex = 0;
                    }
                    switch (direction[turnIndex]) {
                        case "right":
                            column += 1;
                            break;
                        case "left":
                            column -= 1;
                            break;
                        case "down":
                            row += 1;
                            break;
                        case "up":
                            row -= 1;
                            break;
                    }
                    elementsLeft -= 1;
                    numberOfSteps += 1;
                }
            }
        }
        return changedMatrix;
    }

    public static void main(String[] args) {
        String[][] matrixToChange = new String[][]{{"A", "B", "C", "1"},
                {"D", "E", "F", "2"},
                {"G", "H", "I", "3"},
                {"J", "K", "L", "4"},
        };
        String[][] changedMatrix = changeOrder(matrixToChange);
        for (int i = 0; i < matrixToChange.length; i++) {
            for (int j = 0; j < matrixToChange[0].length; j++) {
                System.out.print(changedMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}
