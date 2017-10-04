package com.stackroute.practicetesting.PracticeTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.practicetesting.PracticeTesting.StudentSorter;
import com.stackroute.practicetesting.PracticeTesting.Student;


public class StudentSorterTest {
	StudentSorter studSorter;
	
	@Before
	public void setup() {
		studSorter = new StudentSorter();
	}
	
	@After
	public void teardown() {
		studSorter = null;
	}
	
	@Test
	public void testNotNull() {
		assertNotNull("Object is null", this.studSorter);
	}
	
	@Test public void testSort() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "john", 20));
		students.add(new Student(2, "messi", 19));
		students.add(new Student(3, "cr7", 22));
		students.add(new Student(4, "villa", 23));
		students.add(new Student(5, "iniesta", 22));
		
		List<Student> sortedStudents = new ArrayList<Student>();
		sortedStudents.add(new Student(4, "villa", 23));
		sortedStudents.add(new Student(5, "iniesta", 22));
		sortedStudents.add(new Student(3, "cr7", 22));
		sortedStudents.add(new Student(1, "john", 20));
		sortedStudents.add(new Student(2, "messi", 19));
		
		List<Student> returnedStudents = this.studSorter.sortStudents(students);
		
		for(int i = 0; i < returnedStudents.size(); i++) {
			System.out.println(sortedStudents.get(i).compareTo(returnedStudents.get(i)));
			assertEquals("List not same", sortedStudents.get(i), returnedStudents.get(i));
		}
		
		assertEquals("Not expected Results", sortedStudents, this.studSorter.sortStudents(students));
	}
}
