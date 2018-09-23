package hhtaskB;

import java.util.Arrays;

public class Map {

    static boolean horizontalCheck(char[][] map, int a, int b, int n) {
        int count = 0;
        Double numberOfRect = new Double(a / n);
        if (a == n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <b; j++) {
                    char[][] newMap = new char[1][b];
                    newMap[0][j] = map[i-1][j];
                    if (findCharInArray(newMap, 'o', 1, b-1) == 1) count = count + 1;

                }
            }
        } else {
            if ((numberOfRect - numberOfRect.intValue()) == 0) {
                for (int i = 0; i < n; i++) {
                    char[][] newMap = new char[a/n][b];
                    for (int j = 0; j < b; j++) {
                        for (int x = 0; x < a / n; x++) {
                            newMap[x][j] = map[x+i*2][j];
                        }
                    }
                    printArray(newMap,a/n,b);
                    System.out.println("\n\n");
                    if (findCharInArray(newMap, 'o', a/n, b) == 1) count = count + 1;
                }
            }
        }
        if (count == n){
            return true;
        }
        else {return false;}
    }

    static boolean verticalCheck(char[][] map, int a, int b, int n) {
        int count = 0;
        Double numberOfRect = new Double(b / n);
        if (b == n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < a; j++) {
                    char[][] newMap = new char[a][1];
                    newMap[j][0] = map[j][i - 1];
                    if (findCharInArray(newMap, 'o', a - 1, 1) == 1) count = count + 1;

                }
            }
        } else {
            if ((numberOfRect - numberOfRect.intValue()) == 0) {
                for (int i = 0; i < n; i++) {
                    char[][] newMap = new char[a][b / n];
                    for (int j = 0; j < a; j++) {
                        for (int x = 0; x < b / n; x++) {
                            newMap[j][x] = map[j][x + i * 2];
                        }
                    }
                  //  printArray(newMap,a,b/n);
                  //  System.out.println("\n\n");
                    if (findCharInArray(newMap, 'o', a, b/n) == 1) count = count + 1;
                }
            }
        }
        if (count == n){
            return true;
        }
        else {return false;}
    }

    static int findCharInArray(char[][] array, char c, int rows, int columns) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == c) count = count + 1;
            }
        }
        return count;
    }
    static void printArray(char[][] array,int rows,int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        char[][] map = {{'.', '.', 'o', '.', '.', '.'},
                {'.', '.', '.', 'o', '.', '.'},
                {'.', 'o', '.', '.', '.', '.'},
                {'.', '.', '.', 'o', '.', '.'}};
        System.out.println(horizontalCheck(map, 4, 6, 4));


    }
}
