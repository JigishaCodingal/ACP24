
public class multimatch {
    public static void main(String[] args) 
	{
      try{
		int x = 40;
		int y = 50;

		int z = x / y;
		System.out.println("Result = " + z);
	  }
      catch(ArithmeticException ex){
		  System.out.println("Exception: cannot divide a number by zero!");
	  }
	  catch(ArrayIndexOutOfBoundsException ex){
		  System.out.println("Exception: please provide minimum 2 cmd args");
	  }
	  catch(NumberFormatException ex){
		  System.out.println("Exception: please provide number without decimal point as args");
	  }
	  System.out.println("--- DONE ---");
	}
}
