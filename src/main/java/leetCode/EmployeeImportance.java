package leetCode;

import java.util.*;

public class EmployeeImportance {
	public int totalSum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getImportance(List<Employee> employees, int id) {
		// 해당하는 employee 찾기
		Employee root = employees.get(0);
		for(Employee e : employees) {
			if(e.id == id) root = e;
		}
		totalSum += root.importance;
		if(root.subordinates.isEmpty()) return totalSum;
		for(int subId : root.subordinates) {
			getImportance(employees, subId);
		}
		return totalSum;
    }

}
