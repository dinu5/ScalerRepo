package day19;

/*
Q1. Leap year? - III

Problem Description

Given an integer A representing a year, Return 1 if it is a leap year else, return 0.

A year is a leap year if the following conditions are satisfied:

The year is multiple of 400.
or the year is multiple of 4 and not multiple of 100.
 */

public class LeafYear3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(2020));
	}
	public static int solve(int A) {
        if(A%4==0){
            if(A%400==0 || A%100!=0){
                return 1;
            }else{
                return 0;
            }
        }
        return 0;
    }
}
