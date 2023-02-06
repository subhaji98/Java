package Abstact;
class Singleton {
	
	private static Singleton single_instance = null;

	
	public String s;

	private Singleton()
	{
		s = " Hello";
	}

	
	public static Singleton getInstance()
	{
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}


class SingletoneExmp {
	
	public static void main(String args[])
	{
		
		Singleton a = Singleton.getInstance();

		// Instantiating Singleton class with variable y
		Singleton b = Singleton.getInstance();

		// Instantiating Singleton class with variable z
		Singleton c = Singleton.getInstance();

		
		System.out.println("Hashcode of a is "
						+ a.hashCode());
		System.out.println("Hashcode of b is "
						+ b.hashCode());
		System.out.println("Hashcode of c is "
						+ c.hashCode());

		
		if (a ==b && b == c) {

			
			System.out.println(
				"Three objects point to the same memory location on the heap i.e, to the same object");
		}

		else {
			
			System.out.println(
				"Three objects DO NOT point to the same memory location on the heap");
		}
	}
}
