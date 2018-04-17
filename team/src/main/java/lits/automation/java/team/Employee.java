package lits.automation.java.team;

/**
 * Model for employee.
 *
 * @since 2018-04-16
 */
public class Employee /*implements Comparable<Employee>*/{
  private String name;
  private String position;
  private int salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
 /* public int compareTo(Employee anotherEmployee) {
		if (anotherEmployee.name.equals(name)) {
			return position.compareToIgnoreCase(anotherEmployee.position);
		}
		return name.compareToIgnoreCase(anotherEmployee.name);	
	}*/
}
