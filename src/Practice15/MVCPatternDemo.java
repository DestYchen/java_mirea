package Practice15;
public class MVCPatternDemo {
    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Dima");
        student.setRollNo("017");
        return student;
    }
    public static void main(String[] args){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Паша");
        controller.setStudentRollNo("016");
        controller.updateView();
    }
}
