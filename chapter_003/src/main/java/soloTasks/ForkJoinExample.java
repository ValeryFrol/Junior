package soloTasks;

import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/*
public class ForkJoinExample extends RecursiveTask<Map<Character,Integer>> {
    private int UNIT_SIZE = 1;
    private int startPos, endPos;
    private String[] array;
    private String[] values;

    public ForkJoinExample(int startPos, int endPos, String[] array) {
        this.startPos = startPos;
        this.endPos = endPos;
        this.array = array;
    }
    public ForkJoinExample(String[] array){
        this.values=array;
        this.startPos=0;
        this.endPos=values.length;
    }

    @Override
    protected Map<Character, Integer> compute() {
        final int current_size = endPos - startPos;
        if (current_size < UNIT_SIZE) return computeSum();
        else {
            int center = current_size / 2;
            int leftEnd = startPos + center;
            ForkJoinExample leftSum = new ForkJoinExample(startPos,endPos,values);
            leftSum.fork();
            int rightSart = startPos+center+1;
            ForkJoinExample rightSum = new ForkJoinExample(rightSart,endPos,values);
            Map<Character,Integer> map = rightSum.compute();
            Map<Character,Integer> map1 = leftSum.join();
            for(Character character: map1.keySet()){
                if()
            }

        }


        return map ;
    }

    private Map<Character, Integer> computeSum() {
        Map<Character, Integer> result = null;
        int sum = 0;
        for (int i = startPos; i < endPos; i++) {
            for (int j = 0; j < values[i].length(); j++) {
                Character c = values[i].charAt(j);
                if (!result.containsKey(c)) result.put(c, 0);
                result.put(c, result.get(c) + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = new String[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = "fhgkds jg lsrgje,lfjfjfj.ffff...ffff";
        }
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinExample example = new ForkJoinExample(array);
        System.out.println(pool.invoke(example));


    }
}
*/
