/**
 * 
 */
package com.capgemini.sam;

/**
 * @author Sanchit Singhal
 *
 */
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		ExceptionHandlingDemo ex = new ExceptionHandlingDemo();
		Employee e = null;
		try {
			ex.display(e);
		}catch(IncorrectArgumentException exc)
		{
			exc.printStackTrace();
		}
		
		System.out.println("After Display");
	}
	
	public void display(Employee e) throws IncorrectArgumentException
	{
		try{
			if(e == null) {
				Exception ex = new IncorrectArgumentException("Exception is NULL");
				throw ex;
			}
			System.out.println(e.getAddress()+ "." + e.getSalary());
			System.out.println("Object Displayed");
		}
		catch(Throwable ex){
			ex.printStackTrace();
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Always run block");
		}
	}
}
