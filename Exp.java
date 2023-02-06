package Abstact;
class Employee {
    int salary = 60000;
}
 
// Inherited or Sub Class
class Eng extends Employee {
    int benefits = 10000;
}

public class Exp {

	public static void main(String[] args) {
		Eng E1 = new Eng();
        System.out.println("Salary : " + E1.salary
                           + "\nBenefits : " + E1.benefits);

	}

}
