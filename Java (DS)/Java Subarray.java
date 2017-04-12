import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextLong();
        }
        
        long count = 0;
         for (int i = 0; i < n; i++) 
        {
            long sum = 0;
            for (int j = i; j < n; j++)
            {
                sum += arr[j];
                if (sum < 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}