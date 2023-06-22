package day13;

import java.util.ArrayList;
import java.util.List;

/*
Q1. N/3 Repeat Number

Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem
 */

public class N3RepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(1);
		System.out.println(repeatedNumber(list));
	}
	public static int repeatedNumber(final List<Integer> a) {
        int element1=0;
        int element2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==element1) count1++;
            else if(a.get(i)==element2) count2++;
            else if(count1==0) {
                element1=a.get(i);
                count1++;
            }else if(count2==0){
                element2=a.get(i);
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int ansCount=0;
        for(int e : a){
            if(e==element1) ansCount++;
        }
        if(ansCount>a.size()/3) return element1;
        ansCount=0;
        for(int e : a){
            if(e==element2) ansCount++;
        }
        if(ansCount>a.size()/3) return element2;
        return -1;
	}
}
