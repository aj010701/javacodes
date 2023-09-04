class main
{
public static void main(String args[])
{
int n=4,x=1,count=0;
while(x<=n)
{
if(n%x==0)
{
count++;
}
x++;
}
if(count==3)
System.out.println("super number");
}
}