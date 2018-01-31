import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int gcd(int a, int b) {
  return a == 0 ? b : gcd(b % a, a);
}
    public static int lcm(int n)
{
    int ans = 1;    
    for (int i = 1; i <= n; i++)
        ans = (ans * i)/(gcd(ans, i));
    return ans;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            a=lcm(n);
            System.out.println(a);
        }
    }
}
