package ex1;

public class C1_1_18 {
	public static void main(String[] args) {
		System.out.println(mystery(2,25));
		System.out.println(mystery(3, 11));
		System.out.println(new_mystery(2, 25));
		System.out.println(new_mystery(3, 11));
	}
	
	//可以从结果看出mystery可以用来算乘法返回值为a*b
	public static int mystery(int a, int b) {
		if (b==0) return 0;
		if (b%2 ==0) return mystery(a+a, b/2);
		return mystery(a+a, b/2)+a;
	}
	
	//
	public static int new_mystery(int a, int b) {
		if (b==0) return 1;
		if (b%2 ==0) return mystery(a*a, b/2);
		return mystery(a*a, b/2)*a;
	}
}
