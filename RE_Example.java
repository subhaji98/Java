package Abstact;

class RE_Example {
	  public static void main(String[] args) {

	    try {

	      
	      int divideByZero = 5 / 0;
	      System.out.println("Arithmetic Operation");
	    }
	    
	    catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	  }
	}