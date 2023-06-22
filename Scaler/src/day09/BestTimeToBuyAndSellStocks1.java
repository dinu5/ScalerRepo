package day09;

/*
Q1. Best Time to Buy and Sell Stocks I

Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.
 */

public class BestTimeToBuyAndSellStocks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 5, 2, 4};
		System.out.println(maxProfit(arr));
	}
	public static int maxProfit(final int[] A) {
        if(A.length<=1) return 0;
        int buy = A[0];
        int sell=Integer.MIN_VALUE;
        for(int i=1;i<A.length;i++){
            if(A[i]<buy) buy=A[i];
            sell = Math.max(sell,A[i]-buy);
        }
        return sell;
    }
}
