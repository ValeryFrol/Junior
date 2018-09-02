package other;

public class DemoMain {
    public static void main(String[] args) {
               String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " "+ sb.hashCode());

        String t = new String("Ok");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }

    public static void exampleHash(String data) {
        int hash = 0;
        for(int i =0; i<data.length(); i++)  {
            hash  = 31 * hash + data.charAt(i); // data[i]
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

