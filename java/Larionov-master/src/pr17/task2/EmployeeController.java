package pr17.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeId(String id) {
        model.setId(id);
    }

    public String getEmployeeId() {
        return model.getId();
    }

    public void setHoursWorked(double hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public double getHoursWorked() {
        return model.getHoursWorked();
    }

    public void setHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public double getHourlyRate() {
        return model.getHourlyRate();
    }
    public double calculateSalary() {
        return model.calculateSalary();
    }
    public void updateView() {
        double salary = calculateSalary();
        view.printEmployee(model.getName(), model.getId(),
                model.getHoursWorked(), model.getHourlyRate(), salary);
    }
    public void calculateQuickSalary(String name, String id, double hours, double rate) {
        model.setName(name);
        model.setId(id);
        model.setHoursWorked(hours);
        model.setHourlyRate(rate);
        updateView();
    }
}
