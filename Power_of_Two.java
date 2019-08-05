/*

Question: Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false

*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        double res = 0.0;
        double m = n;
        if(n==1)
            return true;
        else
        {
            while (m > 0.5)
            {
                m = m / 2;  
                res = m;  
            }
           System.out.println(res);
        }
        
        if(res == 0.5)
            return true;
        else
            return false;
         
    }
}