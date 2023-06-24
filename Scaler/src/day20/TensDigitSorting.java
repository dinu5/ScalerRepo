package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Q3. Tens Digit Sorting

Problem Description
Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.

If a number has no tens digit, we can assume value to be 0.
If 2 numbers have same tens digit, in that case number with max value will come first
Solution should be based on comparator.
 */

public class TensDigitSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(11);
		list.add(7);
		list.add(19);
		
		System.out.println(solve(list));
	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,new Comparator<Integer>(){
            public int compare(Integer n1,Integer n2){
                int num1 = (n1/10)%10;
                int num2 = (n2/10)%10;
                if(num1==num2) return n2-n1;
                return num1-num2;
            }
        });
        return A;
    }
}
