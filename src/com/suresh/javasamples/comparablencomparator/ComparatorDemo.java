package com.suresh.javasamples.comparablencomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		System.out.println("Comparator Demo...");

		List<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student(101, 20, "dept1"));
		stdList.add(new Student(102, 18, "dept2"));
		stdList.add(new Student(103, 36, "dept3"));

		System.out.println("before sort -->" + stdList.get(0).getAge());

		Collections.sort(stdList, new StudentComparator());
		System.out.println("after sort -->" + stdList.get(0).getAge());

	}

}

class Student {

	private int empId;
	private int age;
	private String dept;

	public Student(int id, int age, String dept) {

		this.empId = id;
		this.age = age;
		this.dept = dept;
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

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		if (o1.getAge() > o2.getAge())
			return 1;
		if (o1.getAge() < o2.getAge())
			return -1;
		if (o1.getAge() == o2.getAge())
			return 0;
		return 0;

	}

}