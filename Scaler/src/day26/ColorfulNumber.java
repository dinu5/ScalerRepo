package day26;
import java.util.Set;
import java.util.HashSet;

/*
Q3. Colorful Number

Problem Description
Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits. 
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245. 
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 */

public class ColorfulNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 23;
		System.out.println(colorful(A));
	}
	public static int colorful(int A) {
        Set<Integer> set=new HashSet<>();
        while(A>0){
            int temp=A;
            int prod = 1;
            while(temp>0){
                prod = prod*(temp%10);

                if(set.contains(prod)) return 0;
                set.add(prod);
                temp/=10;
            }
            A/=10;
        }
        return 1;
    }
}
