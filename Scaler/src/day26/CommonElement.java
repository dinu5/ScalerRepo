package day26;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/*
Q2. Common Elements

Problem Description
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.
 */

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(1);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(3);
		list2.add(1);
		list2.add(2);
		System.out.println(solve(list1,list2));
	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        Map<Integer,Integer> map=new HashMap<>();
        for(int e : A){
          if(map.containsKey(e)){
            map.put(e,map.get(e)+1);
          }else{
            map.put(e,1);
          }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int e : B){
          if(map.containsKey(e)){
            if(map.get(e)>0){
              ans.add(e);
              map.put(e,map.get(e)-1);
            }
          }
        }
        return ans;
    }
}
