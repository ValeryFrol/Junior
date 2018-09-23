package hhtaskB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MapVariantTwo {

    static ArrayList<int[]> allPossibleSides(int sideOne, int sideTwo, int quantity) {
        int s = sideOne * sideTwo / quantity;
        ArrayList<int[]> sides = new ArrayList<>();
        for (int i = 1; i <= sideOne; i++) {
            for (int j = sideTwo; j > 0; j--) {
                if (i * j == s) {
                    int[] x = {i, j};
                    sides.add(x);
                }
            }
        }
        for (int i = 1; i <= sideOne; i++) {
            for (int j = sideOne; j > 0; j--) {
                if (i * j == s) {
                    int[] x = {i, j};
                    sides.add(x);
                }
            }
        }
        return sides;
    }

    static int[] findAndMarkRectengular(int[] vacancyCoord, ArrayList<int[]> sides, char[][] workingMap, int sideOne, int sideTwo, int start) {
        for (int r = start; r < sides.size(); r++) {
            int x = vacancyCoord[0] - sides.get(r)[0] + 1;
            if (x < 0) x = 0;
            int y = vacancyCoord[1] - sides.get(r)[1] + 1;
            if (y < 0) y = 0;
            int countI = 0;
            int countX = 0;
            for (int i = 0; i < sides.get(r)[0]; i++) {
                for (int j = 0; j < sides.get(r)[1]; j++) {
                    char[][] rectengular = new char[sides.get(r)[0]][sides.get(r)[1]];
                    for (int n = 0; n < (x + sides.get(r)[0]); n++) {
                        for (int m = 0; m < (y + sides.get(r)[1]); m++) {
                            rectengular[i][j] = workingMap[i + n][j + m];
                            if (rectengular[i][j] == 'o') countI = countI + 1;
                            if (rectengular[i][j] == 'X') countX = countX + 1;
                        }
                    }
                    if (countI == 1 && countX == 0) {
                        for (int n = 0; n < (x + sides.get(r)[0]); n++) {
                            for (int m = 0; m < (y + sides.get(r)[1]); m++) {
                                workingMap[i + n][j + m] = 'X';
                            }
                        }
                        int[] result = {x, y, r};
                        return result;
                    } else if (y == vacancyCoord[1] || (y + sides.get(r)[1] == sideTwo) || x == vacancyCoord[0] || (x + sides.get(r)[0] == sideOne)) {
                        break;
                    }
                    y = y + 1;
                    x = x + 1;

                }
            }
        }
        int[] result2 = {-1};
        return result2;

    }


    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String wholeMap = s.readLine();

        //ArrayList<String> map = new ArrayList<>();
        String[] map = wholeMap.split("\n");
        /*while (sc.) {
            map.add(sc.nextLine());
        }*/
        int sideOne = map.length;
        int sideTwo = map[0].length();
        double countVacancy = 0;
        ArrayList<int[]> finalRect = new ArrayList<>();
        int start = 0;
        //ArrayList<int[]> sides = allPossibleSides(sideOne, sideTwo, (int) countVacancy);
        ArrayList<int[]> vacancyCoord = new ArrayList<>();
        char[][] originMap = new char[sideOne][sideTwo];
        //System.out.println(map.size() + "   " + map.get(0).length());
        for (int i = 0; i < sideOne; i++) {
            for (int j = 0; j < sideTwo; j++) {
                originMap[i][j] = map[i].toCharArray()[j];
                if (originMap[i][j] == 'o') {
                    countVacancy = countVacancy + 1;
                    int[] coord = {i, j};
                    vacancyCoord.add(coord);
                }
                System.out.print(originMap[i][j]);
            }
            System.out.println("\n");
        }
        ArrayList<int[]> sides = allPossibleSides(sideOne, sideTwo, (int) countVacancy);
        for (int k = 0; k < sides.size(); k++) {
            System.out.println(sides.get(k)[0]);
            System.out.println(sides.get(k)[1]);
        }
        if (sideOne * sideTwo / countVacancy - (int) (sideOne * sideTwo / countVacancy) != 0) {
            System.out.println(" ");
            System.exit(1);
        } else {

            /*for(int i=0;i<vacancyCoord.size();i++){
                for(int j=0;j<vacancyCoord.get(i).length;j++){
                    System.out.println(vacancyCoord.get(i)[j]);
                }
            }*/
            char[][] workingMap = originMap.clone();


            while (finalRect.size() < countVacancy) {
                for (int currentVac = 0; currentVac < vacancyCoord.size(); currentVac++) {
                    int[] currentResult = findAndMarkRectengular(vacancyCoord.get(currentVac), sides, workingMap, sideOne, sideTwo, start);
                    if (currentResult[0] == -1) {
                        if (currentVac == 0) {
                            currentResult[0] = 0;
                            break;
                        } else {
                            currentVac = currentVac - 1;
                            int x = finalRect.get(finalRect.size() - 1)[0];
                            int y = finalRect.get(finalRect.size() - 1)[1];
                            sideOne = sides.get(finalRect.get(finalRect.size() - 1)[2])[0];
                            sideTwo = sides.get(finalRect.get(finalRect.size() - 1)[2])[1];
                            for (int v = x; v < sideOne; v++) {
                                for (int f = y; f < sideTwo; f++) {
                                    workingMap[v][f] = originMap[v][f];
                                }
                            }
                            start = finalRect.get(finalRect.size() - 1)[2] + 1;
                            for (int b = 0; b < finalRect.size() - 2; b++) {
                                finalRect.set(b, finalRect.get(b));
                            }
                        }
                    } else {
                        finalRect.add(currentResult);
                        currentVac = currentVac + 1;
                        start = 0;
                    }
                    if (currentResult.length == 0) {
                        System.out.println("");
                        break;
                    }

                }
            }

        }
        for (int i = 0; i < finalRect.size() - 1; i++) {
            int x = finalRect.get(i)[0];
            int y = finalRect.get(i)[1];
            int a = sides.get(finalRect.get(i)[2])[0];
            int b = sides.get(finalRect.get(i)[2])[1];
            for (int j = x; x < a; x++) {
                for (int h = y; h < b; h++) {
                    System.out.println(originMap[j][h]);
                }
                System.out.println("\n");
            }
        }
        System.out.println("\n");

    }
}
