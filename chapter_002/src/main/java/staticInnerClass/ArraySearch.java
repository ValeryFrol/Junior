package staticInnerClass;

public class ArraySearch {

    public static Pair minMax(double[] numbers){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double x : numbers) {
          if(min>x)min=x;
          if(max<x)max=x;
        }
        return new Pair(min,max);
    }
    public static class Pair {//нет ссылки на внешний класс

        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }




}
