import java.util.*;
class Main
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int a[][]=new int[n][3];
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
a[i][j]=sc.nextInt();
}
for(int i=1;i<n;i++)
{
a[i][0]=Math.max(a[i-1][1],a[i-1][2])+a[i][0];
a[i][1]=Math.max(a[i-1][0],a[i-1][2])+a[i][1];
a[i][2]=Math.max(a[i-1][0],a[i-1][1])+a[i][2];
}
if(n<0)
System.out.println(0);
else
System.out.println(Math.max(a[n-1][0],Math.max(a[n-1][1],a[n-1][2])));
}
}