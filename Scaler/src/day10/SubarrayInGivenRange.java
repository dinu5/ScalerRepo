package day10;

import java.util.Arrays;

public class SubarrayInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 2, 6};
		System.out.println(Arrays.toString(solve(arr,1,3)));
	}
	public static int[] solve(int[] A, int B, int C) {
        return Arrays.copyOfRange(A,B,C+1);
    }
}
