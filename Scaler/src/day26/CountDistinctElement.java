package day26;
import java.util.Set;
import java.util.HashSet;

/*
Q5. Count distinct elements

Problem Description
Given an array A of N integers, return the number of unique elements in the array.
 */

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 3, 6, 6};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        return set.size();
    }
}
