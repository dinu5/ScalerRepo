package day38;

/*
Q4. Search in a row wise and column wise sorted matrix

Problem Description
Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing

 */

public class SearchRowwiseColumnWiseSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1, 2, 3}, {4,5,6},{7,8,9}};
		int B = 2;
		System.out.println(solve(A, B));
	}
	public static int solve(int[][] A, int B) {
        int ans = 0;
        int n = A.length;
        int m = A[0].length;
        for(int i=0;i<A.length;i++){
            if(B<=A[i][m-1]){
                for(int j=0;j<m;j++){
                    if(A[i][j]==B){
                        ans = ((i+1)*1009) + (j+1);
                        return ans;
                    }
                }
            }
        }
        return -1;
    }
}
