package day47;

import java.util.ArrayList;

/*
Q1. Combinations

Problem Description
Given two integers A and B, return all possible combinations of B numbers out of 1 2 3 ... A.

Make sure the combinations are sorted.

To elaborate,

Within every entry, elements should be sorted. [1, 4] is a valid entry while [4, 1] is not.
Entries should be sorted within themselves.
WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING COMBINATIONS.
 */

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 4;
		int B = 2;
		System.out.println(helper(A,B,1,new ArrayList<Integer>(),new ArrayList<ArrayList<Integer>>()));
	}
	public static ArrayList<ArrayList<Integer>> helper(int A,int B,int i,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans){
        if(curr.size()==B){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        if(i>A) return ans;
        curr.add(i);
        helper(A,B,i+1,curr,ans);
        curr.remove(curr.size()-1);
        helper(A,B,i+1,curr,ans);
        return ans;
    }
}
