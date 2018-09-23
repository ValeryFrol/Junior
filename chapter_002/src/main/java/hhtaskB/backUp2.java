package hhtaskB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class backUp2 {
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
        for (int h = 0; h < sides.size(); h++) {
            for (int l = h + 1; l < sides.size(); l++) {
                if (sides.get(h)[0] == sides.get(l)[0] && sides.get(h)[1] == sides.get(l)[1]) {
                    sides.remove(sides.get(l));
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
            //    for (int i = 0; i < sides.get(r)[0]; i++) {
            //      for (int j = 0; j < sides.get(r)[1]; j++) {
            char[][] rectengular = new char[sides.get(r)[0]][sides.get(r)[1]];
            //for (int n = 0; n < (x + sides.get(r)[0]); n++) {
            //  for (int m = 0; m < (y + sides.get(r)[1]); m++) {
            for (int c = 0; c < sides.get(r)[0]; c++) {
                for (int d = 0; d < sides.get(r)[1]; d++) {
                    rectengular[c][d] = workingMap[c + x][d + y];
                    if (rectengular[c][d] == 'o') countI = countI + 1;
                    if (rectengular[c][d] == 'X') countX = countX + 1;
                }
            }

            //}
            //}
            if (countI == 1 && countX == 0) {
                for (int n = 0; n < (x + sides.get(r)[0]); n++) {
                    for (int m = 0; m < (y + sides.get(r)[1]); m++) {
                        workingMap[n][m] = 'X';
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


        int[] result2 = {-1};
        return result2;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> map = new ArrayList<>();
        while (sc.hasNext()) {
            map.add(sc.nextLine());
        }
        int sideOne = map.size();
        int sideTwo = map.get(0).length();
        double countVacancy = 0;
        int currentVac = 0;
        ArrayList<int[]> finalRect = new ArrayList<>();
        int start = 0;
        ArrayList<int[]> vacancyCoord = new ArrayList<>();
        char[][] originMap = new char[sideOne][sideTwo];
        for (int i = 0; i < sideOne; i++) {
            for (int j = 0; j < sideTwo; j++) {
                originMap[i][j] = map.get(i).charAt(j);
                if (originMap[i][j] == 'o') {
                    countVacancy = countVacancy + 1;
                    int[] coord = {i, j};
                    vacancyCoord.add(coord);
                }
            }

        }
        ArrayList<int[]> sides = allPossibleSides(sideOne, sideTwo, (int) countVacancy);
        if (sideOne * sideTwo / countVacancy - (int) (sideOne * sideTwo / countVacancy) != 0) {
            System.out.println(" ");
            System.exit(1);
        } else if (countVacancy == 1) {
            for (int i = 0; i < sideOne; i++) {
                for (int j = 0; j < sideTwo; j++) {
                    System.out.print(originMap[i][j]);

                }
                System.out.print("\n");
            }
        } else {
            {
                char[][] workingMap = new char[sideOne][sideTwo];
                for (int p = 0; p < sideOne; p++) {
                    for (int w = 0; w < sideTwo; w++) {
                        workingMap[p][w] = originMap[p][w];
                    }
                }


                while (finalRect.size() < countVacancy) {
                    //  for (int currentVac = 0; currentVac < vacancyCoord.size(); currentVac++) {
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
                        //System.out.println("");
                        break;
                    }

                }


                //}
                for (int i = 0; i < finalRect.size(); i++) {
                    int x = finalRect.get(i)[0];
                    int y = finalRect.get(i)[1];
                    int a = sides.get(finalRect.get(i)[2])[0];
                    int b = sides.get(finalRect.get(i)[2])[1];
                    for (int j = x; x < a + x; x++) {
                        for (int h = y; h < b + y; h++) {
                            System.out.print(originMap[j][h]);
                        }
                        System.out.println("\n");
                        break;
                    }
                }
                System.out.println("\n");
            }
        }

    }
}
