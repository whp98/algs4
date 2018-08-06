package ex;

public class C1_1_14 {
	public static void main(String[] args) {
		
	}
	
	public static String exR2(int n) {
		String s = exR2(n - 3) + n + exR2(n - 2) + 2;
		if(n <= 0) return "";
		return s;
	}
	
	
}
