package day38;

/*
Q2. Row with maximum number of ones

Problem Description
Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).

 */

public class RowWithMaximumNumberOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{0, 1, 1},
					{0, 0, 1},
					{0, 1, 1}};
		
		System.out.println(solve(A));
	}
	public static int solve(int[][] A) {
        int n = A.length;
        
        int maxLen = 0;
        int ans = 0;
        for(int i=0;i<A.length;i++){
            
            if(A[i][n-1]==1){
                int j = n-1;
                int count = 0;
                while(j>=0){
                    if(A[i][j]==1){
                        count++;
                        j--;
                    }else break;
                }
                if(count>maxLen){
                    maxLen = count;
                    ans = i;
                }
            }
        }
        return ans;
	}
}
