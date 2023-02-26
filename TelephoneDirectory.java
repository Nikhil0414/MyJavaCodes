import java.util.Scanner;
class TelephoneIndex
{
	private String name;
	private String phoneNumber;

	public TelephoneIndex(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstNCharactersOfName(int n)
	{
		return name.substring(0, n%name.length());
	}

	@Override 
	public String toString()
	{
		return String.format("%20s %15s", name, phoneNumber);
	}

}

public class TelephoneDirectory
{
	public static void main(String[] args)
	{
		TelephoneIndex[] t = new TelephoneIndex[7];
		t[0] = new TelephoneIndex("abc123", "9999999999");
		t[1] = new TelephoneIndex("zxy987", "1111111111");
		t[2] = new TelephoneIndex("abpqr567", "5555555555");
		t[3] = new TelephoneIndex("asdfgh901209", "1234567");
		t[4] = new TelephoneIndex("lkjhg512656", "09876");
		t[5] = new TelephoneIndex("qwert4567", "33221155");
		t[6] = new TelephoneIndex("mnbvc286498236", "72163458");


		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("first few chars of name to search? ");
			String query = scanner.nextLine();
			int queryLength = query.length();
			for(int i=0; i<t.length; i++)
			{
				if(t[i].getFirstNCharactersOfName(queryLength).equals(query))
				{
					System.out.println(t[i]);
				}
			}
		}

	}
}