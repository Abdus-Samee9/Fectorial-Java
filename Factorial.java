import java.util.Scanner;

public class Factorial {


    public static int fac(int num)
    {
int fact=1;


        for(int i = 1; i<=num; i++)
        {
         fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int result =Factorial.fac(num);
System.out.println("Factorial of "+num+" is "+result);
        sc.close();
    }
}