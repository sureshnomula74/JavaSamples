package com.suresh.javasamples.immutabledemo;

// very simple immutable class which doesn’t hold any mutable object and never expose its fields in any way; 
//these type of classes are normally used for caching purposes.

public final class ImmutableStudent {

	private final int id;
	private final String name;
	private final Age age;

	public Age getAge() {

		Age cloneAge = new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMonth(this.age.getMonth());
		cloneAge.setYear(this.age.getYear());

		return cloneAge;
	}

	public ImmutableStudent(int id, String name, Age age) {
		this.name = name;
		this.id = id;

		Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());

		this.age = cloneAge;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
