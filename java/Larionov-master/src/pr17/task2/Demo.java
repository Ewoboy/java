package pr17.task2;

public class Demo {
    public static void main(String[] args) {
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.setEmployeeName("Ivan Petrov");
        controller.setEmployeeId("E001");
        controller.setHoursWorked(160);
        controller.setHourlyRate(25.0);
        controller.updateView();

        controller.setEmployeeName("Nikita Larionov");
        controller.setEmployeeId("N001");
        controller.setHoursWorked(170);
        controller.setHourlyRate(37.0);
        controller.updateView();
    }
}
