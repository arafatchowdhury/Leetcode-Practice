/*
Question: You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

*/


    class Solution {
    public int numJewelsInStones(String J, String S) {

        int counter = 0;
         
        if (J.length() >50 || S.length() > 50) //if length of any given string>50; return 0
            return 0;
        
        for (int i=0; i < J.length();i++){
            for (int j=0; j< S.length();j++){
                if(J.charAt(i) == S.charAt(j)) //if found a match, increment counter by 1 and move to next S
            }
        }
        return counter;
    }
}
