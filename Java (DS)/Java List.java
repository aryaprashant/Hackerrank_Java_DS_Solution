import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        
        int len = input.nextInt();
        for(int i =0 ; i<len;i++)
            {
            int data = input.nextInt();
            list.add(data);
           }
        
        int NumOfQuery = input.nextInt();
        for(int j =0; j<NumOfQuery;j++)
            {
            String Q = input.next();
            if(Q.equals("Insert"))
                {
                int InsertPosition = input.nextInt();
                int value = input.nextInt();
                list.add(InsertPosition,value);
            }
            else if(Q.equals("Delete"))
                {
                int DeletePosition = input.nextInt();
                list.remove(DeletePosition);
            }
        }
        
        for(int k = 0; k<list.size();k++)
            {
        System.out.print(list.get(k)+" ");
        }
    }
}
