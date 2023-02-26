package javada1;


public class Fourstring {
	public static void main(String[] args) 
	{
		String str1 = "Write the class with the following static methods";
		String str2 = "the";
		String str3 = "that";
		char[] cArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v','w', 'x','y', 'z'};

		System.out.println(" 1st Method word count------> ");	
		int numberOfWords = StringMethods.wordCount(str1);
		System.out.println("Number of words in the string : " + str1 +" : is : " + numberOfWords);

		System.out.println("\n 2nd Method array to string------> ");
		String string4 = StringMethods.arrayToString(cArr);
		System.out.println(string4);

		System.out.println("\n 3rd Method most frequent------> ");
		char mostFrequent = StringMethods.mostFrequent(str1);
		System.out.println("Most frequently occuring character: " + mostFrequent);

		System.out.println("\n 4th Method replace sub string------> ");
		String string = StringMethods.replaceSubstring(str1, str2, str3);
		System.out.println(string);

	}
}


class StringMethods
{
	static int wordCount(String string1) 
	{
		int n = 0;
		for(int i = 0; i < string1.length(); i++) 
		{
			char ch = string1.charAt(i);
			if(Character.isWhitespace(ch)) 
			{
				n = n + 1;
			}
		}
		return n + 1;
	}


	static String arrayToString(char[] charArray) 
	{
		return String.valueOf(charArray);
	}


	static char mostFrequent(String string1) 
	{
		char mostFrequent = ' ';
		int most = 0;
		int j;
		for(int i = 0; i < string1.length(); i++) 
		{
			int count = 0;
			char ch = string1.charAt(i);

			for(j = 0; j < string1.length(); j++) 
			{
				if(ch == string1.charAt(j))count = count + 1;
			}

			if(count >= most) 
			{
				most = count;
				mostFrequent = ch;
			}
		}

		return mostFrequent;
	}


	static String replaceSubstring(String string1, String string2, String string3) {
		return string1.replaceAll(string2, string3);
	}
}

