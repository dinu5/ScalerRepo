package day21;

/*
Q1. Length of longest consecutive ones

Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

Input Format
The only argument given is string A.

Output Format
Return the length of the longest consecutive 1’s that can be achieved.
 */

public class LengthOfLongestConsedcutive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "111011101";
		System.out.println(solve(str));
	}
	public static int solve(String A) {
		int ans=0;
        int totalOne=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1') totalOne++;
        }
        for(int i=1;i<A.length();i++){
            int count=0;
            if(A.charAt(i)=='0'){
                int left=i-1;
                while(left>=0 && A.charAt(left)=='1'){
                    count++;
                    left--;
                }
                int right=i+1;
                while(right<A.length() && A.charAt(right)=='1'){
                    count++;
                    right++;
                }
                if(count==totalOne){
                    ans = count;
                }else{
                    ans = Math.max(ans,count+1);
                }
            }
            
            
        }
		if(ans==0) return totalOne;
		return ans;
	}
}
