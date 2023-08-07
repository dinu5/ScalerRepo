package day36;

import java.util.Arrays;

/*
Q2. Continuous Sum Query

Problem Description
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B
 */

public class ContinuousSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		int[][] query = {{1, 2, 10},{2, 3, 20},{2, 5, 25}};
		System.out.println(Arrays.toString(solve(A,query)));
	}
	public static int[] solve(int A, int[][] B) {
		int[] arr = new int[A];
        for(int i=0;i<B.length;i++){
            int l = B[i][0]-1;
            int r = B[i][1];
            int x = B[i][2];
            arr[l] = arr[l]+x;
            if(r<A)
                arr[r] = arr[r]-x;
        }
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
	}
}
