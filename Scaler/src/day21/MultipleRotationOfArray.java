package day21;

import java.util.ArrayList;

/*
Q2. Multiple left rotations of the array

Problem Description
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.
 */

public class MultipleRotationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(3);
		ArrayList<ArrayList<Integer>> ans = solve(list,list2);
		for (ArrayList<Integer> row : ans) {
		       for (Integer element : row) {
		             System.out.print(element + " ");
		       }
		       System.out.println();
		}				
	}
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int e : B){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<A.size();i++){
                temp.add(A.get((i+e)%A.size()));
            }
            ans.add(temp);
        }
        return ans;
    }
}
