import java.util.Arrays;
public class ques6a {

	public static void main(String[] args)
	{
		int[] a = { 10, 20, 30, 40 };

		int[] b = { 50, 10, 70, 80 };

		int aLen = a.length;
		int bLen = b.length;
		int c= aLen + bLen;
		int[] result = new int[c];

		System.arraycopy(a, 0, result, 0, aLen);
		System.arraycopy(b, 0, result, aLen, bLen);
		System.out.println(Arrays.toString(result));
	}
}



