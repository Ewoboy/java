package pr17.task2;

public class EmployeeView {
    public void printEmployee(String name, String id, double hoursWorked, double hourlyRate, double salary){
        System.out.println("=== Employee Salary Details ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + salary);
        System.out.println("===============================");
    }
}
