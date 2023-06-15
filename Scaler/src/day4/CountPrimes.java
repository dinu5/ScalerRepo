package day4;

/*
 * Problem Description
You will be given an integer n. 
You need to return the count of prime numbers less than or equal to n.
 */

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(19));

	}
	public static int solve(int A) {
        int count=0;
        for(int i=2;i<=A;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
	static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
