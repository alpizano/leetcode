public class Solution {
	  public int lengthOfLongestSubstring(String s) {
		 int currCounter = 0;
	     int memCounter = 0; 
	     String currString = "";
	     String memString = "";     
	     int i = 0;
	     int j = i+1;
	     
	     if (s.length() == 0) {
	            return 0;
	        }
	        else if(s.length() == 1) {
	            return 1;
	        }
	        else {	                 
	   while (i < s.length() -1) {
		   currString = Character.toString(s.charAt(i));	
		  currCounter++;
	   while(j <= s.length()-1) {
		   currString = currString + s.charAt(j);		 
		   currCounter++;		  	
		   if (currString.substring(0,currCounter-1).contains(Character.toString(s.charAt(j))) && currCounter > memCounter) 
		   {			 
			   memString = currString.substring(0,currString.length()-1);
			   memCounter = currCounter-1;
			   //System.out.println("string memory is: " + memString + " when i= "+ i + " and j = " + j);
			  //System.out.println("They are equal at i=" + i + " and j= " + j);
			  //System.out.println("Counter value is: " + memCounter);		   
			   currString = "";
			   i = j-1;
			   j++;
			   //System.out.println();						   
			   currCounter = 0;
			   break;		   
		   }
		   j++;
	   }
	   
	   i++; 
	   }
	  }
	     return memCounter;
	   //System.out.println("Longest substring word is: " + memString);
	   //System.out.println("Longest substring length is: " + memCounter);
	   //System.out.println("------------------------------------------");
	     
	  }
	  
	  public static void main(String[] args) {
		  String word1 =  "abcabcbb";
		  String word2  = "bbbbb";
		  String word3 = "pwwkew";
		  String word4 = "au";
		  
		  Solution func = new Solution(); // instantiate object to run method of class
		 
		System.out.println("The length of longest substring is: " + func.lengthOfLongestSubstring(word1));
		System.out.println("The length of longest substring is: " + func.lengthOfLongestSubstring(word2));
		System.out.println("The length of longest substring is: " + func.lengthOfLongestSubstring(word3));
		System.out.println("The length of longest substring is: " + func.lengthOfLongestSubstring(word4));

}
}
