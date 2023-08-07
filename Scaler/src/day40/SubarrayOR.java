package day40;

public class SubarrayOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 5};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
        int MOD = 1000000007;
        long n = A.length;
        long subarrays = n * (n+1)/2;
        long ans = 0;
        for(int i=0;i<32;i++){
            long total = subarrays;
            long zeroCount = 0;
            
            for(int j=0;j<A.length;j++){
                if((A[j]&(1<<i))==0){
                    zeroCount++;                   
                }else{  
                    long zero = (zeroCount * (zeroCount+1)/2)%MOD;                  
                    total = total - zero;                  
                    zeroCount = 0;                    
                }
            }
            if(zeroCount != 0){
                long zero = (zeroCount * (zeroCount+1)/2)%MOD;
                total = total - zero;
            }
            
            long pow = (1<<i);
            ans = (ans%MOD + (total%MOD * pow%MOD)%MOD)%MOD;
            
            
        }
        return (int)ans%MOD;
    }
}
