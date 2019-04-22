package employee;

public abstract class Employee implements Payable {
  protected String employeeId;
  protected String name;
  protected double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return this.averageMonthlySalary;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return "employee ID: " + getEmployeeId() + "Name: " + getName() + "Average Salary: "
           + String.format(format, averageMonthlySalary);
  }

  public abstract void calculatePay();
}