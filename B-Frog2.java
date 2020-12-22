import java.util.*;
class Main
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    if(n<0)
      System.out.println(0);
    int h[]=new int[n];
    for(int i=0;i<n;i++)
      h[i]=sc.nextInt();
    int dp[]=new int[n];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    dp[1]=Math.abs(h[1]-h[0]);
    for(int i=2;i<n;i++)
    {
      for(int j=i-1;j>=i-k && j>=0;j--)
      {
        dp[i]=Math.min(dp[i],dp[j]+Math.abs(h[i]-h[j]));
      }
    }
    System.out.println(dp[n-1]);
  }
}