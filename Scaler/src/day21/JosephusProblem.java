package day21;

/*
Q3. Josephus Problem - 2

Problem Description
There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. This process continues till there is only 1 person remaining. Find the last person standing in the circle.
 */

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(5));
	}
	public static int solve(int A) {
		int nearestPower2 = 0;
		for(int i=A;i>=0;i--) {
			if((i&(i-1))==0) {
				nearestPower2=i;
				break;
			}
		}
		int remaining = A - nearestPower2;
		return remaining*2+1;
	}
}
