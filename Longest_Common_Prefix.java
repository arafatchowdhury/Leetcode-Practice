
/*
Question: Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.

*/

class Solution {
public:
	string longestCommonPrefix(vector<string> &strs) {
		string s("");
		
		if (strs.size() == 0) return s;
		
		if (strs.size() == 1) return strs[0];
		
		for (int j=0; j < strs[0].size(); ++j) 
		{
			char res = strs[0][j];
			
			for (int i=1; i<strs.size(); ++i)
			{
				if (res != strs[i][j]) return s;
			}
			
			s = s + res; 
			
		}
		
		return s;
	}
	
};
