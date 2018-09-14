package hhtaskB;

import java.util.Arrays;

public class Map {

    static void horizontalCheck(char[][] map, int a, int b, int n) {
        boolean result = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b; j++) {
                char[][] newMap = new char[1][b];
                newMap[0][j] = map[i][j];
                for (int y = 0; y < b; y++) {

                        System.out.print(newMap[0][y]);

                }
            }
            System.out.println("\n\n\n");

        }
    }


    public static void main(String[] args) {
        char[][] map = {{'.', '.', '.', 'o', '.', '.'},
                {'.', '.', '.', '.', 'o', '.'},
                {'.', 'o', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', 'o'}};
        horizontalCheck(map, 4, 6, 4);
    }
}
