package soloTasks.srtudentTaskCompare;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student> {
    String surname;
    int groupNumber;
    int[] marks = new int[6];

    public Student(String surname, int groupNumber, int[] marks) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public Student() {

    }

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.groupNumber > s2.groupNumber) return 1;
        else if (s1.groupNumber == s2.groupNumber) return 0;
        else return -1;
    }

    @Override
    public int compareTo(Student s) {
        return (this.surname).compareTo(s.surname);
    }
}
