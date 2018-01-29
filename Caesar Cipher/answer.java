import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        // Complete this function
        String newString = "";
          int carr[] = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
                {
                    carr[i] = ((int)s.charAt(i));
                    if((carr[i]+(k%26))>90)
                    {
                        newString+=(char)(carr[i]-90+64+(k%26));
                    } 
                    else if((carr[i]+(k%26))<=90)
                    {
                         newString+=(char)(carr[i]+(k%26));
                    }
             }   
           if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
             {
                carr[i] = ((int)s.charAt(i));
                if((carr[i]+(k%26))>122){
                newString+=(char)(carr[i]-122+96+(k%26));
             } 
             else if((carr[i]+(k%26))<=122)
                 {
                     newString+=(char)(carr[i]+(k%26));
                 }
           }
            if((int)s.charAt(i)>=91&&(int)s.charAt(i)<=96){
                carr[i] = (int)s.charAt(i);
                newString+=(char)(carr[i]);
            }
             if((int)s.charAt(i)<65 || (int)s.charAt(i)>122){
                carr[i] = (int)s.charAt(i);
                 newString+=(char)(carr[i]);
            }
                 
        
        }
        return newString;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
