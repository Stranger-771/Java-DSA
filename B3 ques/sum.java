import java.util.*;

class Sum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
       int a= sc.nextInt();
        int b= sc.nextInt();
        int c= a+b;
        int d=a*b;
        int e= a/b;
        int f=a-b;
        int g=a%b;

        System.out.println("the sum is "+c);
        System.out.println("the product is "+d);
        System.out.println("the divison is "+e);
        System.out.println("the subs  is "+f);
        System.out.println("remainder value is  "+g);
    }
}
