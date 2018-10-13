package soloTasks;

public class changeIntegersPlaces {
    public static void changeIntegers(int a, int b){
        a=a+b-(b=a);
        System.out.println("a="+a+" b="+b);
    }

    public static void main(String[] args) {
        changeIntegers(2,3);
    }
}
