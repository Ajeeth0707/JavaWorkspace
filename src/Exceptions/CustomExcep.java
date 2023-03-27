package Exceptions;

public class CustomExcep extends Exception {
	public CustomExcep(String str)
	{
		super(str);
	}
	
	public static void main(String args[])
	{
		try
		{
			//throw new CustomExcep("haii");
			int a=4/0;
		}
		finally
		{
			System.out.println("inside finally");
		}
	}

}
