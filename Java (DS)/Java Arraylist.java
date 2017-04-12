import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int NumberOfArrayList  = input.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0 ; i<NumberOfArrayList; i++)
            {
            int listSize = input.nextInt();
            list.add(new ArrayList<Integer>());
            for(int j = 0; j<listSize; j++)
                {
                int value = input.nextInt();
                list.get(i).add(value);
            }
        }
        
        int NumberOfOutput = input.nextInt();
        for(int k = 0; k<NumberOfOutput; k++)
            {
             int listNumber = input.nextInt();
             int listIndex = input.nextInt();
            if(listNumber>list.size()||listIndex>list.get(listNumber-1).size())
                System.out.println("ERROR!");
			else 
                System.out.println(list.get(listNumber-1).get(listIndex-1));
        }
    }
}