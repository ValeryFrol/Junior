package soloTasks.srtudentTaskCompare;

import java.util.ArrayList;
import java.util.Collections;

import static soloTasks.srtudentTaskCompare.Student.*;

public class AllStudents {
    ArrayList<Student> allStudents = new ArrayList<>();

    public void namesWithFourOrFive() {
        int count = 0;
        for (int i = 0; i < allStudents.size(); i++) {
            for (int j = 0; j < allStudents.get(i).marks.length; j++) {
                if (allStudents.get(i).marks[j] == 4 || allStudents.get(i).marks[j] == 5) count += 1;
            }
            if (count == allStudents.get(i).marks.length)
                System.out.println(allStudents.get(i).surname + ", group №" + allStudents.get(i).groupNumber);
            count = 0;
        }
    }

    public void averageMarkFourWithHalf() {
        int sum = 0;
        for (int i = 0; i < allStudents.size(); i++) {
            for (int j = 0; j < allStudents.get(i).marks.length; j++) {
                sum += allStudents.get(i).marks[j];
            }
            if ((double) sum / allStudents.get(i).marks.length == 4.5)
                System.out.println(allStudents.get(i).surname + ", group №" + allStudents.get(i).groupNumber);
        }
    }

    public static void main(String[] args) {
        AllStudents all = new AllStudents();
        all.allStudents.add(new Student("Frolova", 1, (new int[]{4, 5, 4, 4, 5, 5})));
        all.allStudents.add(new Student("Petrov", 1, new int[]{4, 3, 4, 2, 5, 1}));
        all.allStudents.add(new Student("Ivanova", 2, new int[]{4, 5, 5, 4, 5, 4}));
        all.allStudents.add(new Student("Tolstov", 2, new int[]{1, 5, 4, 4, 5, 3}));
        all.allStudents.add(new Student("Erokhin", 3, new int[]{4, 2, 2, 2, 5, 5}));
        all.allStudents.add(new Student("Krasnov", 1, new int[]{4, 5, 4, 3, 3, 3}));
        all.namesWithFourOrFive();
        System.out.println(" ");
        all.averageMarkFourWithHalf();
        System.out.println(" ");
        Collections.sort(all.allStudents);
        Collections.sort(all.allStudents, new Student());
        for (Student s : all.allStudents
                ) {
            System.out.println(s.surname + ", group №" + s.groupNumber);
        }
    }
}
