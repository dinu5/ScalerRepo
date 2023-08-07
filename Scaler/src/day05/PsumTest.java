package day05;

import java.util.Arrays;

public class PsumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,1,1,1},
					 {1,1,1,1},
					 {1,1,1,1}};
		
		int N = A.length;
		int M = A[0].length;
        // Building Psum matrix
		int[][] psum = new int[N][M];
		psum[0][0] = A[0][0];
		for(int i=1;i<M;i++){
            psum[0][i] = psum[0][i-1] + A[0][i];
        }
        for(int i=1;i<N;i++){
            psum[i][0] = psum[i-1][0] + A[i][0];
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<M;j++){
                psum[i][j] = psum[i][j-1] + psum[i-1][j] - psum[i-1][j-1] + A[i][j];
            }
        }
        
        for(int[] arr : psum) {
        	System.out.println(Arrays.toString(arr));
        }
	}

}
