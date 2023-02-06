package Abstact;

 abstract class Mav {

		abstract void printInfo();
	}

	class Empl extends Mav {
		void printInfo() {
			String name = "subhajit";
			int age = 25;
			float salary = 323.2F;

			System.out.println(name);
			System.out.println(age);
			System.out.println(salary);

		}

	}

	class Exp3 {
		public static void main(String args[]) {
			Mav s = new Empl();
			s.printInfo();
		}
	}
