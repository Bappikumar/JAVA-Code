import java.util.Scanner;
class input
{
    public static void main(String a[])
    {
        Scanner sc1 = new Scanner(System.in);
        int i;
        String s;
        System.out.println("Enter the value of i: ");
        i=sc1.nextInt();
        System.out.println("Enter the value of s: ");
        s=sc1.next();

        System.out.println("The output value: \n");
        System.out.println(i);
        System.out.println(s);
        
    }
}