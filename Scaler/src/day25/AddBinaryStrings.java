package day25;

/*
Q7. Add Binary Strings

Problem Description
Given two binary strings A and B. Return their sum (also a binary string).

 */

public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "100";
		String str2 = "11";
		System.out.println(addBinary(str1,str2));
	}
	public static String addBinary(String A, String B) {
        StringBuilder ans=new StringBuilder();
        int carry=0;
        int i=A.length()-1;
        int j=B.length()-1;
        while(i>=0 || j>=0 || carry!=0){
            int sum = carry;
            if(i>=0){
                sum+=A.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum+=B.charAt(j) - '0';
                j--;
            }
            ans.append(sum%2);
            carry = sum/2;
        }
        return ans.reverse().toString();
    }
}
