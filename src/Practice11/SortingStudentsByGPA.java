package Practice11;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGPA() == s2.getGPA()){
            return 0;
        }
        if (s1.getGPA() > s2.getGPA()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
