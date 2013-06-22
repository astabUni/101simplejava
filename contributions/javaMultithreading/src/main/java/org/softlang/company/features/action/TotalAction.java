package org.softlang.company.features.action;

import org.softlang.company.model.Department;
import org.softlang.company.model.Employee;
import org.softlang.company.features.context.Context;

public class TotalAction implements Action<Department, Double> {

	private double total = 0;

	@Override
	public void execute(Context context, Department department) {
		// Lets context organize the total of the sub departments
		for (Department s : department.getSubdepts()) {
			context.execute(this, s);
		}

		// Total manager and employees
		increaseTotalBy(department.getManager().getSalary());
		for (Employee e : department.getEmployees()) {
			increaseTotalBy(e.getSalary());
		}
	}

	private synchronized void increaseTotalBy(double x) {
		total += x;
	}

	@Override
	public Double getResult() {
		return total;
	}

}