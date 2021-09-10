import java.lang.*;
import java.util.Scanner;

public class TestBook
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        System.out.println(" Book name:");
        String n = str.nextLine();
        System.out.println(" Book pages:");
        int a = str.nextInt();
        System.out.println(" Read book pages :");
        int x = str.nextInt();
        Book p1 = new Book(n,a,x);
        System.out.println(p1);
        p1.alreadyRead();
    }
}
