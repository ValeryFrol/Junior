package soloTasks;

public class ArrayToString {
    public static String EquationToString(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!x(arr.length - 1 - i, arr[i]).equals("")) {
                result.append(x(arr.length - 1 - i, arr[i]));
                result.append("+");
            } else {
                result.append(x(arr.length - 1 - i, arr[i]));
            }
        }
        if (result.length() != 0) result.deleteCharAt(result.lastIndexOf("+"));
        return result.toString();
    }

    public static String x(int i, int element) {
        StringBuilder sb = new StringBuilder();
        if (i == 0 && element == 0) return "";
        else if (i != 0 && element == 0) return "";
        else {
            sb.append(element);
            for (int j = 0; j < i; j++) {
                sb.append("X");
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 0, 5, 1};
        System.out.println(EquationToString(arr));
    }
}
