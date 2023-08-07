package day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> list = new ArrayList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		
		ArrayList<Interval> ans = merge(list);
		for(Interval i : ans) {
			System.out.println("["+i.start+" "+i.end+"]");
		}

	}
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		ArrayList<Interval> ans = new ArrayList<>();
		Collections.sort(intervals,new Comparator<Interval>() {
			public int compare(Interval a,Interval b) {
				return a.start - b.start;
			}
		});
		int start = intervals.get(0).start;
        int end = intervals.get(0).end;
		int i=1;
		while(i<intervals.size()) {
            int newStart = intervals.get(i).start;
            int newEnd = intervals.get(i).end;
			if(end>=newStart && newEnd>=start) {
				start = Math.min(start, intervals.get(i).start);
				end = Math.max(end, intervals.get(i).end);
			}else {
                Interval in = new Interval(start,end);
				ans.add(in);
                start = intervals.get(i).start;
                end = intervals.get(i).end;
			}
			i++;
		}
		ans.add(new Interval(start,end));
		return ans;
	}
}
