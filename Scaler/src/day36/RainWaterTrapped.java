package day36;

public class RainWaterTrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0, 1, 0, 2};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
		int lmax = A[0];
		int rmax = A[A.length-1];
		int l = 1;
		int r = A.length-2;
		int total = 0;
		while(l<=r) {
			if(lmax<=rmax) {
				if(A[l]<=lmax) {
					total += lmax - A[l];
					
				}else {
					lmax = A[l];
				}
				l++;
			}else {
				if(A[r]<=rmax) {
					total += rmax - A[r];
				}else {
					rmax = A[r];
				}
				r--;
			}
		}
		return total;
	}
}
