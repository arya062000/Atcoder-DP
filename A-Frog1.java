import java.util.*;
class Main
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<0)
      System.out.println(0);
    int h[]=new int[n];
    for(int i=0;i<n;i++)
      h[i]=sc.nextInt();
    int dp[]=new int[n];
    Arrays.fill(dp,10000*10000);
    dp[0]=0;
    dp[1]=Math.abs(h[1]-h[0]);
    for(int i=2;i<n;i++)
    {
      dp[i]=Math.min(dp[i-2]+Math.abs(h[i-2]-h[i]), dp[i-1]+Math.abs(h[i-1]-h[i]));
    }
    System.out.println(dp[n-1]);
  }
}