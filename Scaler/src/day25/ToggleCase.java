package day25;

/*
Q3. Toggle Case

Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
 */

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(solve(str));
	}
	public static String solve(String A) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<A.length();i++){
            int ch = A.charAt(i);
            char ch1 = (char)(ch^(1<<5));
            ans.append(ch1);
        }  
        return ans.toString();                 
    }
}
