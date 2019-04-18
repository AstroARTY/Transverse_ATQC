package employee;

public class SalariedEmployee extends Employee {
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
    calculatePay();
  }

  @Override
  public void calculatePay() {
    averageMonthlySalary = fixedMonthlyPayment;
  }

  @Override
  public double getAverageMonthlySalary() {
    return this.averageMonthlySalary;
  }
}