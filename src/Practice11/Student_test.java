package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
public class Student_test {
    public static void main(String[] args){
        ArrayList<Student> stud = new ArrayList<Student>();
        Student s1 = new Student(5, 2);
        Student s2 = new Student(10, 3);
        Student s3 = new Student(7, 5);
        Student s4 = new Student(1, 4);
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);
        Student[] students = new Student[]{
                new Student(5, 2),
                new Student(10, 3),
                new Student(7, 5),
                new Student(1, 4)
        };
        System.out.println("Массив до сортировки:");
        for (Student s11: students){
            System.out.println(s11);
        }
        for (int left = 0; left < students.length; left++){
            int value = students[left].getiDNumber();
            Student left_st = students[left];
            int i = left - 1;
            for (; i >= 0; i--){
                if (value < students[i].getiDNumber()){
                    students[i + 1] = students[i];
                } else{
                    break;
                }
            }
            students[i + 1] = left_st;
        }
        System.out.println();
        System.out.println("Массив после сортировки вставками по iDNumber:");
        for (Student g: students){
            System.out.println(g);
        }
        System.out.println();
        System.out.println("Массив после быстрой сортировки по GPA:");
        SortingStudentsByGPA SortingGPA = new SortingStudentsByGPA();
        stud.sort(SortingGPA);
        for (Student st: stud){
            System.out.println(st);
        }
    }
}
