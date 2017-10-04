package com.stackroute.practicetesting.PracticeTesting;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private int id;
	private String name;
	private int age;
	
	Student() {
		
	}
	
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + "\t name=" + name + "\t\t age=" + age + "]\n";
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Student stud1) {
		// TODO Auto-generated method stub
		if(this.getAge() != stud1.getAge()) return (this.getAge()-stud1.getAge());
		if(this.getName().equals(stud1.getName())) return (this.getName().compareTo(stud1.getName()));
		return (this.getId()-stud1.getId());
	}
	
	public boolean equals(Student stud1) {
		return this.compareTo(stud1) == 0;
	}

	public int compare(Student stud0, Student stud1) {
		// TODO Auto-generated method stub
		if(stud0.getAge() != stud1.getAge()) return (stud0.getAge()-stud1.getAge());
		if(stud0.getName().equals(stud1.getName())) return (stud0.getName().compareTo(stud1.getName()));
		return (stud0.getId()-stud1.getId());
	}
	
}
