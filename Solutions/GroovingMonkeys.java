public class GroovingMonkeys{
    
    public static boolean isSorted(char[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
    
    
     public static int dance(int arr[],char m[],int n,int count){
        if(count>0 && isSorted(m))
            return 0;   
         
         char temp[] = new char[n];
         for(int i=0;i<n;i++){
             temp[arr[i]-1] = m[i];
         }
         count+=1;
         return 1 + dance(arr,temp,n,count);      
         
     }
        
     public static void main(String []args){
        
        int arr[] = {3,6,5,4,1,2};
        char m[] = {'a','b','c','d','e','f'};
        int n = arr.length;
        int count = 0;
        int sec = dance(arr,m,n,count);
        System.out.println(sec);       
        
     }
}
