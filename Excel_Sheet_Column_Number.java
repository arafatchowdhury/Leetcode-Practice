
/*

Question: Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
Example 1:

Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701

*/


class Solution {
    public int titleToNumber(String s) {
        
         int length = s.length();
        
	    int letter = 0;
        int sum = 0;
        
        
         if(length == 1)
            {
    		    sum = s.charAt(0) - 'A' + 1;      
            }
        else
        {
            sum = s.charAt(0) - 'A' + 1;      
            for(int i = 1; i < length; i++)
            {
                letter = s.charAt(i) - 'A' + 1;   
                
                sum = (sum * 26);  
                sum += letter;

            }
        } 
        return sum;  
    }
}