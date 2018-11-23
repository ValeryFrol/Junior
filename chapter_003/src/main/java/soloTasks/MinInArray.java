package soloTasks;

public class MinInArray {

    public static void main(String[] args) {

        int[] numbers = {0, 5, -12, -12, 1, 5, 1, -9};
        int min = numbers[0], count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]==min)count+=1;
            else if(numbers[i]<min){
                min=numbers[i];
                count=1;
            }
        }
        System.out.println(min + " " + count);
    }
}
