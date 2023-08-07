package day38;

import java.util.ArrayList;

/*
Q1. Merge Intervals

Problem Description
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.
 */

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> list = new ArrayList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(6,9));
		Interval newInterval = new Interval(2,5);
		ArrayList<Interval> ans = insert(list,newInterval);
		for(Interval i : ans) {
			System.out.println("["+i.start+" "+i.end+"]");
		}
		

	}
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> ans = new ArrayList<>();
        int i;
		for(i=0;i<intervals.size();i++) {
			if(intervals.get(i).end<newInterval.start){
                ans.add(intervals.get(i));
            }else if(newInterval.end<intervals.get(i).start){
                ans.add(newInterval);
                for(int j=i;j<intervals.size();j++){
                    ans.add(intervals.get(j));
                }
                return ans;
            }else{
                newInterval.start = Math.min(newInterval.start,intervals.get(i).start);
                newInterval.end = Math.max(newInterval.end,intervals.get(i).end);
            }
		}
       ans.add(newInterval);
	   return ans;
	}
}

