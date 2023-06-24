package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Q4. Largest Number

Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.
 */

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(30);
		list.add(34);
		list.add(5);
		list.add(9);
		System.out.println(largestNumber(list));
	}
	public static String largestNumber(final List<Integer> A) {
        StringBuilder ans=new StringBuilder();
        Collections.sort(A,new Comparator<Integer>(){
            public int compare(Integer n1,Integer n2){
                String s1 = ""+n1;
                String s2 = ""+n2;
                String num1=s1+s2;
                String num2=s2+s1;
                return num2.compareTo(num1);
                
            }
        });
        boolean f=false;
        for(int i=0;i<A.size();i++){
            if(f==false && A.get(i)!=0) f=true;
            if(f){
                ans.append(A.get(i));
                
            }
                
        }
        if(f==false) return "0";
        return ans.toString();

    }
}
