import java.util.*;
public class gcd_lcm
{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
        int n1,n2,gcd=0,lcm=0,i;
        n1=input.nextInt();
        n2=input.nextInt();
        for(i=1;i<=n1||i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("gcd= "+gcd);
        lcm=(n1*n2)/gcd;
        System.out.println("lcm= "+lcm);
    }
}