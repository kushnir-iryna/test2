package lits.automation.java.team;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		String Name1 = o1.getName();
		String Name2 = o2.getName();
		String Pos1 = o1.getPosition();
		String Pos2 = o2.getPosition();

		if (Name1.equals(Name2)) {
			return Pos1.compareTo(Pos2);
		}
		return Name1.compareTo(Name2);

	}

}
