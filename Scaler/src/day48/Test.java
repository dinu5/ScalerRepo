package day48;

public class Test {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(0,0,2,1);
		System.out.println(count);
	}
	public static void fun(int sr,int sc,int dr,int dc) {
		if(sr>dr || sc>dc) {
			return;
		}
		if(sr==dr && sc==dc) {
			count++;
			return;
		}
		fun(sr,sc+1,dr,dc);
		fun(sr+1,sc,dr,dc);
		fun(sr+1,sc+1,dr,dc);
	}
}
