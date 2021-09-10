import java.lang.*;
import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        String n = str.nextLine();
        int a = str.nextInt();
        Ball b1 = new Ball(n,a);
        System.out.println(b1);
        b1.intoMillimeters();
    }
}