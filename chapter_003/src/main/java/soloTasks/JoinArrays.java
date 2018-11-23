package soloTasks;

public class JoinArrays {

    public static int[] joinArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int counter1 = 0, counter2 = 0;
        for (int r = 0; r < arr3.length; r++) {
           if(counter1>=arr1.length)arr3[r]=arr2[counter2++];
           //else if(counter1)
        }


        while (counter1 < arr1.length) {
            for (int i = 0; i < arr1.length * 2; i += 2) {
                if (arr1[counter1] < arr2[counter2]) {
                    arr3[i] = arr1[counter1];
                    arr3[i + 1] = arr2[counter2];
                } else if (arr1[counter1] == arr2[counter2]) {
                    arr3[i] = arr1[counter1];
                } else {
                    arr3[i] = arr2[counter2];
                }
                counter1 += 1;
                counter2 += 1;
            }
        }
        while (counter2 < arr2.length) {
            for (int i = arr1.length * 2 + 1; i < arr3.length; i++) {
                arr3[i] = arr2[counter2];
                counter2 += 1;
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < joinArrays(arr1, arr2).length; i++) {
            System.out.println(joinArrays(arr1, arr2)[i]);
        }
    }
}
