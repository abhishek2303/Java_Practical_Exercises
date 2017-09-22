
public class MemberVariable {
    Member m;

    MemberVariable() {
	m = new Member();
    }

    MemberVariable(String name, int age, double salary) {
	m = new Member(name, age, salary);
	System.out.println("Name: " + m.name);
	System.out.println("Age: " + m.age);
	System.out.println("Salary: " + m.salary);
    }

}
