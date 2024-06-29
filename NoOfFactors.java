import java.util.*;
class NoOfFactors
{
public static void main(String[] args)
{
int i,n,factors=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
factors=factors+1;
}
System.out.println("number of factors: "+factors);
}
}