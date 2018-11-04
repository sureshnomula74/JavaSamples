package com.suresh.javasamples.comparablencomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		System.out.println("Comparable Demo...");

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(101, 20, "dept1"));
		empList.add(new Employee(102, 18, "dept2"));
		empList.add(new Employee(103, 36, "dept3"));

		System.out.println("before sort -->" + empList.get(0).getAge());

		Collections.sort(empList);
		System.out.println("after sort -->" + empList.get(0).getAge());

	}

}

class Employee implements Comparable<Employee> {

	private int empId;
	private int age;
	private String dept;

	public Employee(int id, int age, String dept) {

		this.empId = id;
		this.age = age;
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.age > o.getAge())
			return 1;
		if (this.age < o.getAge())
			return -1;
		if (this.age == o.getAge())
			return 0;
		return 0;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
