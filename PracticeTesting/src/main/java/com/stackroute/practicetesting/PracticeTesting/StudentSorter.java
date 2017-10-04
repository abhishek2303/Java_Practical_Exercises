package com.stackroute.practicetesting.PracticeTesting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.stackroute.practicetesting.PracticeTesting.Student;

public class StudentSorter {
	
	public StudentSorter() {
		
	}
	
	public List<Student> sortStudents(List<Student> studList) {
		Collections.sort(studList, this.getStudentComparator());
		
		return studList;
	}

	private Comparator<Student> getStudentComparator() {
		return new Comparator<Student> () {

			public int compare(Student stud0, Student stud1) {
				// TODO Auto-generated method stub
				if(stud0.getAge() != stud1.getAge()) return -(stud0.getAge()-stud1.getAge());
				if(stud0.getName().equals(stud1.getName())) return -(stud0.getName().compareTo(stud1.getName()));
				return -(stud0.getId()-stud1.getId());
			}
			
		};
	}
	
}
