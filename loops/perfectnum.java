class main
{
public static void main(String args[])
{
int n=4,x=1,sum=0;
while(x<n)
{
if(n%x==0)
{
sum=sum+x;
}
x++;
}
if(sum==6)
System.out.println("perfect number");
else
System.out.println("not a perfect");
}
}