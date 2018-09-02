package other;

public class My {

    public static void main(String[] args) {
        Object obj = new Integer(4);
        Integer c = (Integer)obj;

        Employee [] staff = new Employee[10];
        obj = staff; //масиивы относятся к тем типам, которые в них содержатся
        obj = new int[10];
    }
}

