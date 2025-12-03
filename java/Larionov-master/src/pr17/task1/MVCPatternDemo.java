package pr17.task1;

public class MVCPatternDemo {
    public static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Nikita");
        student.setRollNO("10");
        return student;
    }
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Alice");
        controller.setStudentRollNo("15");
        controller.updateView();
    }
}
