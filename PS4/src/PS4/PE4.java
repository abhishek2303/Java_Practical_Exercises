package PS4;

import java.io.IOException;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class PE4 {
	public static void main(String[] args) throws IOException {
		Maintest mt = new Maintest();
		sort(mt.getStudents());
		for(Student student: mt.getStudents()) {
			System.out.println(student.getAge() + "\t" + student.getName() + "\t\t" + student.getId());
		}
		//System.out.println(mt.getStudents());
		
	}
	
	public static void sort(List<Student> students) {
		Collections.sort(students, new StudentSorter());
	}
}

class Maintest {
	private ArrayList<Student> students;
	Maintest() {
		students = new ArrayList<Student>();
		students.add(new Student(1, "john", 20));
		students.add(new Student(2, "messi", 19));
		students.add(new Student(3, "cr7", 22));
		students.add(new Student(4, "villa", 23));
		students.add(new Student(5, "iniesta", 22));
	}
	
	public List<Student> getStudents() {
		return students;
	}
}

class Student {
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
	
}

class StudentSorter implements Comparator<Student> {

	@Override
	public int compare(Student stud0, Student stud1) {
		// TODO Auto-generated method stub
		if(stud0.getAge() != stud1.getAge()) return -(stud0.getAge()-stud1.getAge());
		if(stud0.getName().equals(stud1.getName())) return -(stud0.getName().compareTo(stud1.getName()));
		return -(stud0.getId()-stud1.getId());
	}
	
}