package Exceptions;

import java.io.IOException;

public class tryCtchblock {
	public void m1()  
	{
		throw new ArithmeticException();
	}
	public void m2() {
		
		m1();
		
		
	}
	public static void main(String args[])
	{
		tryCtchblock tb=new tryCtchblock();
		tb.m2();
	}
}
