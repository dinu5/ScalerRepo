package day21;

/*
Q2. Count Increasing Triplets

Problem Description
You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
 */

public class CountIncreasingTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 3};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int triplets=0;
        for(int i=1;i<A.length;i++){
            int left=i-1;
            int right=i+1;
            int count1=0;
            int count2=0;
            while(left>=0){
                if(A[left]<A[i]){
                    count1++;
                }
                left--;
            }
            while(right<A.length){
                if(A[right]>A[i]) count2++;
                right++;
            }
            triplets += count1*count2;
        }
        return triplets;
    }
}
