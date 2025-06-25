package com.dsa.learning;

public class Capital {
	public String toCapital(String input)
	{
		if ( input == null || "".equals(input))
		{
			return "";
		}
		else
		{
			String words[] = input.split(" "); // split => {'hello', 'world'}
			String result = ""; // first loop => Hello_, (+=), second loop => Hello_World_
			for ( int i = 0; i < words.length; i++ )
			{
				result += toCapitalWord(words[i]) + " "; 
			}
			return result.trim(); // (trim => Hello_World)
		}
		
	}

	private String toCapitalWord(String input) {
		String word = Character.toUpperCase(input.charAt(0)) + input.substring(1);
		return word;
	}
	
	public static void main(String[] args)
	{
		Capital cap = new Capital();
		String output = cap.toCapital("i am aung hla paing");
		System.out.print(output);
	}

}

