package day47;

import java.util.ArrayList;

/*
Q2. Generate all Parentheses II

Problem Description
Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.
 */

public class GenerateAllParenthesesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(helper(n,0,0,"",new ArrayList<String>()));

	}
	public static ArrayList<String> helper(int n,int open,int close,String curr,ArrayList<String> ans){
		if(curr.length()==2*n) {
			ans.add(curr);
			return ans;
		}
		if(open<n) {
			curr = curr.concat("(");
			helper(n,open+1,close,curr,ans);
		}
		if(close<open) {
			curr = curr.concat(")");
			helper(n,open,close+1,curr,ans);
		}
		return ans;
	}
}
