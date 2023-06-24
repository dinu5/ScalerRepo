package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Q3. Factors sort

Problem Description
You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space

 */

public class FactorSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(8);
		list.add(9);
		System.out.println(solve(list));
	}
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,new Comparator<Integer>(){
           public int compare(Integer n1,Integer n2){
               int count1 = countFactors(n1);
               int count2 = countFactors(n2);
               if(count1==count2) return n1-n2;
               return count1-count2;
           }
       });
       return A;
    }
    public static int countFactors(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(i*i==n) count+=1;
            else if(n%i==0) count+=2;
            
        }
        return count;
    }

}
