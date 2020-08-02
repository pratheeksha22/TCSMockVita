import java.util.Scanner; 
import java.util.*; 
public class Petrol Pump{
  public static int max(int a,int b)
  {
    if(a>b)
      return a;
    return b;
  }
  public static int min(int a,int b)
  {
    if(a<b)
      return a;
    return b;
  }

  public static int petrol(int v[],int n,int sum)
  {
    boolean t[][] = new boolean[n+1][sum+1];
    for (int i = 0; i <= n; i++) 
              t[i][0] = true; 

    for (int i = 1; i <= sum; i++) 
              t[0][i] = false;
    for(int i = 1;i<n+1;i++)
    {
      for(int j=1;j<sum+1;j++)
      {
        if(v[i-1]<=j)
          t[i][j] = t[i-1][j]||t[i-1][j-v[i-1]];
        else
          t[i][j] = t[i-1][j];
      }
    }
    int vector[] = new int[sum/2+1];
    int k = 0;
    int m = 0;
    for(int j=0;j<=sum/2;j++)
    {
      if(t[n][j]==true)
        vector[k++] = j;
    }
    for(int i=0;i<k;i++)
      m = max(m,vector[i]);
    return m;
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int v[] = new int[50];
    String input = in.nextLine();
    String str[] = input.split(" ");
    int N = str.length;
    for(int i=0;i<N;i++)
      v[i]=Integer.parseInt(str[i]);
     int sum=0;
     for(int i=0;i<N;i++)
     {     
        sum+=v[i];     
     }
    int sec = petrol(v,N,sum);
    System.out.print(sum-sec);
  }
}
