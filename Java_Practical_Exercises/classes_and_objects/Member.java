public class Member {
    String name;
    int age;
    double salary;

    Member() {
	this.name = "";
	this.age = 0;
	this.salary = 0.0;
    }

    Member(String name, int age, double salary) {
	this.name = name;
	this.age = age;
	this.salary = salary;
    }
}
