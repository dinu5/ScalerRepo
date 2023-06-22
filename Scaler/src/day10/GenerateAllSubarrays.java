package day10;

import java.util.ArrayList;

/*
Q7. Generate all subarrays

Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.
 */

public class GenerateAllSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(solve(list));
	}
	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> inner=new ArrayList<>();
            for(int j=i;j<A.size();j++){
                inner.add(A.get(j));
                outer.add(new ArrayList<>(inner));
            }
        }
        return outer;
    }




    // public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
    //     ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     for(int i=0;i<A.size();i++){
    //         for(int j=0;j<outer.size();j++){
    //             ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
    //             inner.add(A.get(i));
    //             outer.add(inner);
    //         }
    //     }
    //     return outer;
    // }
}
