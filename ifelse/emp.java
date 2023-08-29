class emp
{
public static void main(String args[])
{
int empid=001;
String empname = "raj";
double basicsalary=25000;
double ta,da,hra,totalsalary, total=100,pf,tax,grosssalary,packagee;
ta=(15/total)*25000;
da=(12/total)*25000;
hra=(19/total)*25000;
totalsalary=ta+da+hra+basicsalary;
if(totalsalary>40000)
{
pf=(11/100.0)*25000;
tax=(5/100.0)*25000;
}
else
{
pf=(7/100.0)*25000;
tax=(2.5/100.0)*25000;
}
grosssalary=totalsalary-pf-tax;
packagee=12*grosssalary;
System.out.println("your montly inhand is "+grosssalary+" "+"package:"+" "+packagee);



}}