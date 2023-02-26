import java.util.Scanner;

public class Student
{
    public static void main(String args[]) {
        final int TOTAL_STUDENTS = 50;
        Scanner in = new Scanner(System.in);
        
        int Regnumber[] = new int[TOTAL_STUDENTS];
        char name[] = new char[TOTAL_STUDENTS];
        int Age[] = new int[TOTAL_STUDENTS];
        int submark1[] = new int[TOTAL_STUDENTS];
        int submark2[] = new int[TOTAL_STUDENTS];
        int submark3[] = new int[TOTAL_STUDENTS];
        int submark4[] = new int[TOTAL_STUDENTS];
        double avg[] = new double[TOTAL_STUDENTS];
        
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Regnumber: ");
            Regnumber[i] = in.nextInt();
            System.out.print("Name : ");
            name[i] = in.next().charAt(0);
            System.out.print("Age : ");
            Age[i] = in.nextInt();
            System.out.print("Subject A Marks: ");
            submark1[i] = in.nextInt();
            System.out.print("Subject B Marks: ");
            submark2[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            submark3[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            submark4[i] = in.nextInt();
            avg[i] = (submark1[i] + submark2[i] + submark3[i] + submark4[i]) / 4.0;
        }
        
        System.out.println("\nRoll No\tAverage Marks");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println(Regnumber[i] + "\t"+ name[i] + "\t" + Age[i] + "\t" + avg[i]);
        }

        System.out.println("\nStudents with Average below 50:");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            if (avg[i] < 50)
                System.out.println(Regnumber[i] + "\t" + name[i] + "\t" + Age[i] + "\t" + avg[i]);
        }
    }
}