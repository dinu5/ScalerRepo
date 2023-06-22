package day08;

/*
Q5. Equilibrium index of an array

Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(solve(arr));
	}
	
	public static int solve(int[] A) {
        for(int i=1;i<A.length;i++){
            A[i]+=A[i-1];
        }
        for(int i=0;i<A.length;i++){
            if(i==0){
                if(A[A.length-1]-A[0]==0){
                    return 0;
                }
                
                
            }
            else if(i==A.length-1){
                    if(A[A.length-2]==0){
                        return i;
                    }
            }
            else{
                if(A[i-1]==(A[A.length-1]-A[i])){
                    return i;
            }
            }
            
        }
        return -1;
    }

}
