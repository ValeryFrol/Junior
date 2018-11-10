package soloTasks;

public class MatrixMultiplication {
    //check if the matrix is n*n
    public static boolean matrixValidation(int[][] array1, int[][] array2) {
        if (array1.length != array1[0].length || array2.length != array2[0].length && array1.length != array2.length) {
            return false;
        }
        return true;
    }
    //first version of the multiplication method
    public static int[][] multiplicationVersionOne(int[][] array1, int[][] array2) {
        int size = array1.length, sum = 0;
        int[][] resultArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    sum += array1[j][k] * array2[k][i];
                }
                resultArray[j][i] = sum;
                sum = 0;
            }
        }
        return resultArray;
    }
    //second version of the multiplication method
    public static int[][] multiplicationVersionTwo(int[][] array1, int[][] array2) {
        int size = array1.length, sum = 0;
        int[][] resultArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultArray[j][i] = multiplyTwoArraysWithSameSize(array1[j], transposeMatrix(array2)[i]);
            }
        }
        return resultArray;
    }
    //method for the multiplication of two one dimensional array of the same size
    public static int multiplyTwoArraysWithSameSize(int[] array1, int[] array2) {
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result += array1[i] * array2[i];
        }
        return result;
    }

    //method which transposes matrix
    public static int[][] transposeMatrix(int[][] array) {
        int size = array.length;
        int[][] resultArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultArray[i][j] = array[j][i];
            }
        }
        return resultArray;
    }
    //method to print the matrix
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[][] array1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        if (matrixValidation(array1, array2)) {
            printMatrix(multiplicationVersionOne(array1, array2));
        }
       // printMatrix(transposeMatrix(array1));
        printMatrix(multiplicationVersionTwo(array1,array2));
    }
}
