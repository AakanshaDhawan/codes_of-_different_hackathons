import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
public static int pal( int n)
{
   int temp=n,r,sum=0;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   return 1;    
  else    
   return 0; 
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,min=0,b;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            for(int i=100;i<=999;i++)
            {
                for(int j=100;j<=999;j++)
                {
                    a=i*j;
                    if(a<n && a>min)
                    {
                        if(pal(a)==1)
                            min=a;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
