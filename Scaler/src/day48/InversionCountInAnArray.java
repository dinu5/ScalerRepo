package day48;

/*
Q3. Inversion count in an array

Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).


 */

public class InversionCountInAnArray {
	static int count = 0;
	static int MOD = 1000000007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3, 4, 1, 2};
		mergeSort(A,0,A.length-1);
		System.out.println(count);
	}
	public static int[] mergeSort(int[] A,int s,int e){
        if(s==e){
            int[] temp = new int[1];
            temp[0] = A[s];
            return temp;
        }
        int mid = (s+e)/2;
        int[] a = mergeSort(A,s,mid);
        int[] b = mergeSort(A,mid+1,e);
        int total = a.length+b.length;
        int[] arr = merge(a,b);
        
        return arr;
    }
    public static int[] merge(int[] a,int[] b){
        int[] arr = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k++] = a[i++];
            }else{
                count += a.length-i;
                count = count%MOD;
                arr[k++] = b[j++];
            }
        }
        while(i<a.length){
            arr[k++] = a[i++];
        }
        while(j<b.length){
            arr[k++] = b[j++];
        }
        return arr;
    }
}
