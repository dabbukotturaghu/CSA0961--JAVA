class cube
{
public static void main(String[] args)
{
 int n=27;
 boolean flag = false;
int i;
for(i=0;i*i*i<=n;i++)
{
 double cube=Math.pow(i,3);
if(cube==n)
{
 System.out.println("true :"+i+",-"+i);
 flag = true;
 break;
}
}
if(!flag){
 System.out.println("False");
}
}
}