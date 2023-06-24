package day25;

/*
Q3. String operations

Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 */

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aeiOUz";
		System.out.println(solve(str));
	}
	public static String solve(String A) {
        StringBuilder ans=new StringBuilder();
        A=A.concat(A);
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u'){
                ans.append('#');
            }
            else if(!(A.charAt(i)>='A' && A.charAt(i)<='Z')){
                ans.append(A.charAt(i));
            }
        }
        return ans.toString();
    }
}
