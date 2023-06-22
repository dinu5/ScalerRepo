package day13;

/*
Q4. Majority Element

Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.


 */

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 2};
		System.out.println(majorityElement(arr));
	}
	public static int majorityElement(final int[] A) {
        if(A.length==1) return A[0];
        int count=1;
        int major = A[0];
        for(int i=1;i<A.length;i++){
            if(major==A[i]) count++;
            else{
                count--;
                if(count==0){
                    major=A[i];
                    count=1;
                }
            }
        }
        int totalCount=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==major) totalCount++;
        }
        if(totalCount>=A.length/2) return major;
        return -1;
    }
}
