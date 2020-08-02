import java.util.Scanner;
 
import java.util.*; 
public class Swayamvar{
  
public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int N = in.nextInt();
  String bride = in.next();
  String groom = in.next();
  char br[] = bride.toCharArray();
  char gr[] = groom.toCharArray();
  Queue<Character> b = new LinkedList<>(); 
  Queue<Character> g = new LinkedList<>();
  for(int i=0;i<N;i++)
  {
	b.add(br[i]);
    g.add(gr[i]);
  }
  int r=0;
  for(int i=0;i<N;i++)
  {
	if(gr[i]=='r')
	    r+=1;
  }
  int m = N-r;
  
  int i=0;
  while(b.size()!=0)
  {
    if(b.peek()=='r')
    {
        if(r==0)
            break;
   	    if(g.peek()=='r')
        {
            b.remove();
            g.remove();
            r-=1;
        }
        else
        {
            char n = g.remove();
             g.add(n);
        }
    }    
    if(b.peek()=='m')
    {
        if(m==0)
            break;
   	    if(g.peek()=='m')
        {
             b.remove();
            g.remove();
            m-=1;
      
        }
     else
        {
             char n = g.remove();
            g.add(n);
      
        }  
    }
  }
  
  System.out.print(g.size());
  
}
}
