import java.util.Scanner; 
import java.util.*; 
public class C{
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

  public static int count(int l,int w)
  {
      int t[][] = new int[l+1][w+1];
      for(int i=0;i<w+1;i++)
          t[0][i] = 0;
      for(int i=0;i<l+1;i++)
          t[i][0] = 0;
      for(int i=1;i<l+1;i++)
      {
          for(int j=1;j<w+1;j++)
          {
              if(i==1 && j==1)
                  t[i][j] =1;
              else
                  t[i][j] = 1+t[max(Math.abs(i-j),j)][min(Math.abs(i-j),j)];
          }
      }
      return t[l][w];
  }

  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int minL = in.nextInt();
    int maxL = in.nextInt();
    int minW = in.nextInt();
    int maxW = in.nextInt();
    int i,j;
    int c = 0;
    for(i=minL;i<=maxL;i++)
    {
      for(j=minW;j<=maxW;j++)
      {
         c += count(i,j);
      }
    }
    System.out.print(c);
}
}
