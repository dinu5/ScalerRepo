package day27;
import java.util.*;

/*
 * Q3. Distinct Numbers in Window

Problem Description
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.
 */

public class DistinctNumbersInWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 1, 3, 4, 3};
		int B = 3;
		System.out.println(Arrays.toString(solve(arr,B)));

	}
	
	public static int[] solve(int[] A,int B) {
		Map<Integer,Integer> map=new HashMap<>();
		int[] ans=new int[A.length-B+1];
		for(int i=0;i<B;i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			}else {
				map.put(A[i], 1);
			}
		}
		ans[0]=map.size();
		int k=1;
		int s=1;
		int e=B;
		while(e<A.length) {
			map.put(A[s-1], map.get(A[s-1])-1);
			if(map.get(A[s-1])==0) {
				map.remove(A[s-1]);
			}
			if(map.containsKey(A[e])) {
				map.put(A[e], map.get(A[e])+1);
			}else {
				map.put(A[e], 1);
			}
			ans[k++]=map.size();
			s++;
			e++;
		}
		return ans;
	}

}
