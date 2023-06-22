package day09;

/*
Q7. Bulbs

Problem Description
A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.


 */

public class Bulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 1};
		System.out.println(bulbs(arr));
	}
	public static int bulbs(int[] A) {
        int count=0;
        int flag=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0 && flag==0){
                count++;
                flag=1;
            }
            if(A[i]==1 && flag==1){
                count++;
                flag=0;
            }
        }
        return count;
    }
}
