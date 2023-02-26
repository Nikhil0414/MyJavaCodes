package javada1;

import java.util.*;

public class Telephone
{
	public static void main(String[] args)
	{
		TelInput[] t = new TelInput[7];
		t[0] = new TelInput("abc123", "9999999999");
		t[1] = new TelInput("zxy987", "1111111111");
		t[2] = new TelInput("abpqr567", "5555555555");
		t[3] = new TelInput("abdfgh901209", "1234567");
		t[4] = new TelInput("lkjhg512656", "09876");
		t[5] = new TelInput("qwert4567", "33221155");
		t[6] = new TelInput("mnbvc286498236", "72163458");


		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("first few characters = ");
			String s = sc.nextLine();
			int slen = s.length();
			for(int i=0; i<t.length; i++)
			{
				if(t[i].get(slen).equals(s))
				{
					System.out.println(t[i]);
				}
			}
		}
	}

}



class TelInput
{
	private String name;
	private String phoneNo;

	public TelInput(String name, String phoneNo)
	{
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String get(int n)
	{
		return name.substring(0, n%name.length());
	}

	public String toString()
	{
		return String.format("%20s %20s", name, phoneNo);
	}

}


