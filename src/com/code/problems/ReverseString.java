package com.code.problems;

public class ReverseString 
{
	public static void main(String args[])
	{
		ReverseString revObj = new ReverseString();
		
		System.out.println(revObj.reverseWithNewString("Hello"));
	}
	
	public String reverseWithNewString(String str)
	{
		if(str == null) return null;
		
		StringBuffer reverse = new StringBuffer();
		for(int j = str.length() -1; j>= 0; j--)
		{
			reverse.append(str.charAt(j));
		}
			
		return reverse.toString();
	}
}
