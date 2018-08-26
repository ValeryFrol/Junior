package error;

public class StackTrace {
    public static void main(String[] args) {
        factorial(3);
    }

    public static int factorial(int n){
        System.out.println("factorial("+n+"):");
        Throwable t = new Throwable();
        StackTraceElement[] stackTrace = t.getStackTrace();
        for (StackTraceElement x:stackTrace
             ) {
            System.out.println(x);
        }
        int result;
        if(n<=1)result =1;
        else result = n*factorial(n-1);
        System.out.println("return"+result);
        return result;
    }


}
