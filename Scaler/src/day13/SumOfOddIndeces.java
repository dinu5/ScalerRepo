package day13;

import java.util.Arrays;

public class SumOfOddIndeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2D = {
				{0,2},
				{1,4}
		};
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solve(arr,arr2D)));
	}
	public static int[] solve(int[] A, int[][] B) {
        int[] pSumOdd=new int[A.length];
        pSumOdd[0]=0;
        for(int i=1;i<A.length;i++){
            if(i%2!=0){
                pSumOdd[i]=pSumOdd[i-1]+A[i];
            }else{
                pSumOdd[i]=pSumOdd[i-1];
            }

        }
        int[] ans=new int[B.length];
        for(int i=0;i<B.length;i++){
            int l=B[i][0];
            int r=B[i][1];
            if(l==0){
                ans[i]=pSumOdd[r];
            }else{
                ans[i]=pSumOdd[r]-pSumOdd[l-1];
            }
        }
        return ans;
    }
}
