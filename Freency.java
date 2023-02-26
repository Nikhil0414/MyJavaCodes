import java.util.Scanner;

public class Freency {

    public static void main(String[] args) {
        
        int i,len,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        len = sb.length();
        
        for(i=0;i<len;i++)
        {
            int c=1;
            for(j=0;j<len;j++)
            {
                if(sb.charAt(i)==sb.charAt(j) && (i!=j))
                {
                    c++;
                    sb.setCharAt(j, ' ');
                }
                
            }
            if(c>0 && sb.charAt(i)!=' ')
            {
                System.out.println("The "+sb.charAt(i)+" occurs " + c +" times.");
            }
        }
        
        
        
    }
    
}